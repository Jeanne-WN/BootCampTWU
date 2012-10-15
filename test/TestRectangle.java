import org.junit.Test;

import static junit.framework.Assert.assertEquals;

//Ensures the Rectangle can provide a perimeter and area
public class TestRectangle {
    private Shape rectangle;

    @Test
    public void shouldReturnAreaOf10X2() {
        rectangle = Shape.createRectangle(10, 2);
        assertEquals(20, rectangle.area());
    }

    @Test
    public void shouldReturnAreaOf20X2() {
        rectangle = Shape.createRectangle(20, 2);
        assertEquals(40, rectangle.area());
    }

    @Test
    public void shouldReturnPerimeterOf10X20() {
        rectangle = Shape.createRectangle(10, 20);
        assertEquals(60, rectangle.perimeter());
    }

    @Test
    public void testLength20Width30Perimeter100() {
        rectangle = Shape.createRectangle(20, 30);
        assertEquals(100, rectangle.perimeter());
    }
}
