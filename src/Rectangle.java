//Understands a geometrical description of a space determined by a two opposite side and four right angles.
public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
