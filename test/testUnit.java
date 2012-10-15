import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures that Unit represent the relationship between units.
public class testUnit {
    @Test
    public void OneFeetIs12Inches(){
        assertThat(Unit.FEET.toBase(1), is(12));
    }

    @Test
    public void verifyEqualCategoryOfInchAndFeed(){
        assertThat(Unit.INCHES.sameCategoryTo(Unit.FEET), is(true));
    }

    @Test
    public void verifyInequalityCategoryOfInchAndTSP(){
        assertThat(Unit.INCHES.sameCategoryTo(Unit.TSP), is(false));
    }

}
