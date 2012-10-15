import junit.framework.Assert;
import org.junit.Test;

//Ensures the functionality of measurements
public class TestMeasurement {

    @Test
    public void testCreateInches()
    {
        Measurement inches12=new Measurement(12,Unit.INCHES);
        Assert.assertEquals(12,inches12.getValue());

    }

    @Test
    public void testCreateFeet(){
       Measurement feet = new Measurement(1,Unit.FEET);
        Assert.assertEquals(1, feet.getValue());
    }


    @Test
    public void testToBase()
    {
        Measurement yard = new Measurement(1,Unit.YARD);
        Assert.assertEquals(36,yard.ToBase().getValue());

    }


    @Test
    public void testEquals()
    {
         Measurement inches12=new Measurement(12,Unit.INCHES);
        Measurement feet1=new Measurement(1,Unit.FEET);

        Assert.assertEquals(true,inches12.equals(feet1));
    }

    @Test
    public void ShouldEqual1TBSPAnd3TSP()
    {
        Measurement tbsp1=new Measurement(1,Unit.TBSP);
        Measurement tsp3=new Measurement(3,Unit.TSP);

        Assert.assertEquals(true,tbsp1.equals(tsp3));
    }
}
