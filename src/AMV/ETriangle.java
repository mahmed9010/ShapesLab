package AMV;

public class ETriangle extends Shape {
    private int side;

    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return .5 * side * side * Math.sqrt(3)/2;
    }

    @Override
    public double getPerimeter()
    {
        return side*3;
    }

}
