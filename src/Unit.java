//Understands the relationship between units with Inch to make conversion to lowest unit(inch)
public enum Unit {

    INCHES(1),FEET(12),YARD(36),TSP(1),TBSP(3),OZ(6),CUP(48);

    private int conversionFactor;
    private Unit(int conversionFactor)
    {
        this.conversionFactor=conversionFactor;
    }

    public int toBase(int value)
    {
        return value*conversionFactor;
    }



}
