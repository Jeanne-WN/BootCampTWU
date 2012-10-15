//Understands a geometrical description of the part of a space determined by its external boundary
public abstract class Shape {
    abstract public int area();
    abstract public int perimeter();

    public static Rectangle createRectangle(int length, int width){
         return new Rectangle(length, width);
    }

    public static Square createSquare(int side){
        return new Square(side);
    }
}
