import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures measurement represents the ratio of a physical quantity
public class TestMeasurement {

    @Test
    public void verifyEqualityOf1InchAndItself() {
        Measurement oneInch = new Measurement(1, Unit.INCHES);
        assertThat(oneInch.equals(oneInch), is(true));
    }

    @Test
    public void verifyInequalityOf1InchAndNull() {
        Measurement oneInch = new Measurement(1, Unit.INCHES);
        assertThat(oneInch.equals(null), is(false));
    }

    @Test
    public void verifyInequalityOf1InchAndOtherClass() {
        Measurement oneInch = new Measurement(1, Unit.INCHES);
        Integer otherClass = 1;
        assertThat(oneInch.equals(otherClass), is(false));
    }

    @Test
    public void verifyInequalityOf1InchAnd2Inches() {
        Measurement oneInch = new Measurement(1, Unit.INCHES);
        Measurement twoInches = new Measurement(2, Unit.INCHES);
        assertThat(oneInch.equals(twoInches), is(false));
    }

    @Test
    public void verifySameHashCodeOf1InchAnd1Inch(){
        Measurement oneInch = new Measurement(1, Unit.INCHES);
        Measurement otherOneInch = new Measurement(1, Unit.INCHES);
        assertThat(oneInch.hashCode(), equalTo(otherOneInch.hashCode()));
    }

    @Test
    public void verifySameHashCodeOf12InchAnd1Feed(){
        Measurement twelveInches = new Measurement(12, Unit.INCHES);
        Measurement oneFeed = new Measurement(1, Unit.FEET);
        assertThat(twelveInches.hashCode(), equalTo(oneFeed.hashCode()));
    }

    @Test
    public void verifyEqualityOf1FeetAnd12Inches() {
        Measurement twelveInches = new Measurement(12, Unit.INCHES);
        Measurement oneFeet = new Measurement(1, Unit.FEET);
        assertThat(twelveInches.equals(oneFeet), is(true));
    }

    @Test
    public void verifyEqualityOf3FeetAnd1Yard() {
        Measurement threeFeet = new Measurement(3, Unit.FEET);
        Measurement oneYard = new Measurement(1, Unit.YARD);
        assertThat(threeFeet.equals(oneYard), is(true));
    }

    @Test
    public void verifyEqualityOf1TbspAnd3Tsp() {
        Measurement oneTbsp = new Measurement(1, Unit.TBSP);
        Measurement threeTsp = new Measurement(3, Unit.TSP);
        assertThat(oneTbsp.equals(threeTsp), is(true));
    }

    @Test
    public void verifyEqualityOf1OzAnd2Tbsp() {
        Measurement oneOz = new Measurement(1, Unit.OZ);
        Measurement twoTbsp = new Measurement(2, Unit.TBSP);
        assertThat(twoTbsp.equals(oneOz), is(true));
    }

    @Test
    public void verifyEqualityOf8OzAnd1Cup() {
        Measurement eightOz = new Measurement(8, Unit.OZ);
        Measurement oneCup = new Measurement(1, Unit.CUP);
        assertThat(eightOz.equals(oneCup), is(true));
    }

    @Test
    public void verifyInequalityOf1InchAnd1Tsp() {
        Measurement oneInch = new Measurement(1, Unit.INCHES);
        Measurement oneTsp = new Measurement(1, Unit.TSP);
        assertThat(oneInch.equals(oneTsp), is(false));
    }

    @Test
    public void verifyInequalityOf1FeetAnd1Tsp(){
        Measurement oneFeet = new Measurement(1, Unit.FEET);
        Measurement oneTsp = new Measurement(1, Unit.TSP);
        assertThat(oneFeet.equals(oneTsp), is(false));
    }

    @Test
    public void verifyInequalityOf1YardAnd1Tsp(){
        Measurement oneYard = new Measurement(1, Unit.YARD);
        Measurement oneTsp = new Measurement(1, Unit.TSP);
        assertThat(oneYard.equals(oneTsp), is(false));
    }

    @Test
    public void verifyEqualityOf1KilogramAnd1000Grams(){
        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement oneThousandGrams = new Measurement(1000, Unit.GRAM);
        assertThat(oneKilogram.equals(oneThousandGrams), is(true));
    }

    @Test
    public void verifyAdditionOf1KilogramAnd1000Grams(){
        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement oneThousandGrams = new Measurement(1000, Unit.GRAM);
        Measurement result = new Measurement(2, Unit.KILOGRAM);
        assertThat(oneKilogram.add(oneThousandGrams).equals(result), is(true));
    }

    @Test
    public void verifyAdditionOf2KilogramAnd1000Grams(){
        Measurement twoKilogram = new Measurement(2, Unit.KILOGRAM);
        Measurement oneThousandGrams = new Measurement(1000, Unit.GRAM);
        Measurement result = new Measurement(3, Unit.KILOGRAM);
        assertThat(twoKilogram.add(oneThousandGrams).equals(result), is(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyAdditionOf1KilogramAnd1Yard(){
        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement oneYard = new Measurement(1, Unit.YARD);

        oneKilogram.add(oneYard);
    }
}

