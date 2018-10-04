package AMV;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius)
    {
        super(type: "Circle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return (3.14 * radius * radius);
    }

    @Override
    public double getPerimeter()
    {
        return radius*2*3.14;
    }
}
