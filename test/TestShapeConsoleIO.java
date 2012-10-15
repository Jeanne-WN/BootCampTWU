import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures that ShapeConsoleIO works for communication between system and console
public class TestShapeConsoleIO {
    @Test
    public void TestPrint(){
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        ShapeConsoleIO shapeConsoleIO = new ShapeConsoleIO();
        shapeConsoleIO.print("test");
        assertThat(outputStream.toString(), is("test"));
    }
}
