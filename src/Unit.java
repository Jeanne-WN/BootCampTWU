//Understands the relationship between different kinds of measurements
public enum Unit {
    INCHES(1, UnitCategory.LENGTH), FEET(12, UnitCategory.LENGTH), YARD(36, UnitCategory.LENGTH),
    TSP(1, UnitCategory.VOLUME), TBSP(3, UnitCategory.VOLUME), OZ(6, UnitCategory.VOLUME), CUP(48, UnitCategory.VOLUME),
    KILOGRAM(1000, UnitCategory.MASS), GRAM(1, UnitCategory.MASS);

    private Unit(int conversionFactor, UnitCategory category) {
        this.conversionFactor = conversionFactor;
        this.category = category;
    }

    public int fromBase(int value) {
        return value / conversionFactor;
    }

    private enum UnitCategory{
        LENGTH,
        VOLUME,
        MASS
    }
    private int conversionFactor;
    private UnitCategory category;

    public int toBase(int value) {
        return value * conversionFactor;
    }

    public boolean isComparable(Unit other){
        return this.category.equals(other.category);
    }
}
