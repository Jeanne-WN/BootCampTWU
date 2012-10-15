import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Ensures the Square class can calculate it's attributes
public class TestSquare {
    private Shape square;

    @Test
    public void shouldReturnAreaOf6X6(){
        square = Shape.createSquare(6);
        assertEquals(36, square.area());
    }

    @Test
    public void shouldReturnPerimeterOf6X6(){
        square = Shape.createSquare(6);
        assertEquals(24, square.perimeter());
    }
}
