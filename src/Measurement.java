//Understands the result of determining the ratio of a physical quantity
public class Measurement {

    private int value;
    private Unit unit;

    public Measurement(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Measurement otherMeasurement = (Measurement) other;

        if (! this.unit.isComparable(otherMeasurement.unit)) return false;

        return this.unit.toBase(value) == otherMeasurement.unit.toBase(otherMeasurement.value);
    }

    @Override
    public int hashCode() {
        int result = unit.toBase(value);
        result = 31 * result;
        return result;
    }

    public Measurement add(Measurement otherMeasurement) {

        if( ! this.unit.isComparable(otherMeasurement.unit)) {
            throw new IllegalArgumentException("Not Comparable!");
        }

        int otherValue = otherMeasurement.value;

        if (otherMeasurement.unit != this.unit)
        {
            int otherValueInBase = otherMeasurement.unit.toBase(otherValue);
            otherValue = this.unit.fromBase(otherValueInBase);
        }

        return new Measurement(value + otherValue, this.unit);
    }

}
