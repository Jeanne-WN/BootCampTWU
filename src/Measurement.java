//Understands the different units of measurement
public class Measurement {

    private int value;
    private Unit unit;

    public Measurement(int value,Unit unit)
    {
        this.value=value;
        this.unit=unit;


    }


    public int getValue()
    {
        return value;
    }

    public Measurement ToBase()
    {

        return new Measurement(unit.toBase(value),Unit.INCHES);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        return ( this.ToBase().value== that.ToBase().value);


    }

    @Override
    public int hashCode() {
        return value;
    }
}
