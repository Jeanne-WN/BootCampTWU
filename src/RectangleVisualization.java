import org.apache.commons.lang.StringUtils;

//Understands how to visualize Rectangle
public class RectangleVisualization {

    private ShapeConsoleIO shapeConsoleIO;

    public RectangleVisualization(ShapeConsoleIO shapeConsoleIO) {
        this.shapeConsoleIO = shapeConsoleIO;
    }

    public void visualize(Rectangle rectangle, String symbol) {
        String topAndBottomLine = "";
        String middleLines = "";

        topAndBottomLine = StringUtils.repeat(symbol, rectangle.getWidth()) + "\n";

        middleLines = symbol + StringUtils.repeat(" ", rectangle.getWidth() - 2) + symbol + "\n";
        middleLines = StringUtils.repeat(middleLines, rectangle.getLength() - 2);

        shapeConsoleIO.print(topAndBottomLine + middleLines + topAndBottomLine);
    }
}
