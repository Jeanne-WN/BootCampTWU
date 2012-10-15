//Understands a geometrical description of a space determined by four equal sides and four right angles
public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public int perimeter() {
        return 4 * side;
    }
}
