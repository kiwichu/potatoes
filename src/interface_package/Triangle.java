package interface_package;

public class Triangle  implements Shape{

    private double height;
    private double base;

    public Triangle(double length, double width) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return .5*base*height;
    }
}
