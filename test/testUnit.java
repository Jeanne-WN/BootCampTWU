import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures that Unit represent the relationship between measurements.
public class testUnit {
    @Test
    public void OneFeetIs12Inches(){
        assertThat(Unit.FEET.toBase(1), is(12));
    }

    @Test
    public void verifyEqualCategoryOfInchAndFeed(){
        assertThat(Unit.INCHES.isComparable(Unit.FEET), is(true));
    }

    @Test
    public void verifyInequalityCategoryOfInchAndTSP(){
        assertThat(Unit.INCHES.isComparable(Unit.TSP), is(false));
    }

    @Test
    public void verifyConversionFrom1000GramsTo1Kilogram() {
        Unit kilogram = Unit.KILOGRAM;

        assertThat(kilogram.fromBase(1000), is(1));
    }

    @Test
    public void verifyConversionFrom2000GramsTo2Kilogram() {
        Unit kilogram = Unit.KILOGRAM;

        assertThat(kilogram.fromBase(2000), is(2));
    }

}