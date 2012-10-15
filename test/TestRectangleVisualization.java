import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

//Ensures that RectangleVisualization can draw with a correct shape and symbol
public class TestRectangleVisualization {
    private Shape rectangle;
    private ShapeConsoleIO shapeConsoleIO;
    private RectangleVisualization rectangleVisualization;
    private String expectedDraw;
    private String symbol;

    @Before
    public void setUp(){
        shapeConsoleIO = mock(ShapeConsoleIO.class);
        rectangleVisualization = new RectangleVisualization(shapeConsoleIO);
    }

    @Test
    public void shouldDrawnGraphicOf4X5WithStar() {
        symbol = "*";
        rectangle = Shape.createRectangle(4, 5);
        expectedDraw =
                        "*****\n" +
                        "*   *\n" +
                        "*   *\n" +
                        "*****\n";
    }

    @Test
    public void shouldDrawnGraphicOf3X6WithStar() {
        rectangle = Shape.createRectangle(3, 6);
        symbol = "*";
        expectedDraw =
                        "******\n" +
                        "*    *\n" +
                        "******\n";
    }

    @Test
    public void shouldDrawnGraphicOf3X6WithDot() {
        rectangle = Shape.createRectangle(3, 6);
        symbol = ".";
        expectedDraw =
                        "......\n" +
                        ".    .\n" +
                        "......\n";
    }

    @After
    public void verifyVisualization() {
        rectangleVisualization.visualize((Rectangle) rectangle, symbol);
        verify(shapeConsoleIO).print(expectedDraw);
    }
}
