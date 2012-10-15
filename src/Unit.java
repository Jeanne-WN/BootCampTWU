//Understands the relationship between different kinds of units
public enum Unit {
    INCHES(1, "length"), FEET(12, "length"), YARD(36, "length"),
    TSP(1, "volume"), TBSP(3, "volume"), OZ(6, "volume"), CUP(48, "volume");

    private int conversionFactor;
    private String category;

    private Unit(int conversionFactor, String category) {
        this.conversionFactor = conversionFactor;
        this.category = category;
    }

    public int toBase(int value) {
        return value * conversionFactor;
    }

    public boolean sameCategoryTo(Unit other){
        return this.category.equals(other.category);
    }
}
