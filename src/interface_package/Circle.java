package interface_package;

public class Circle implements Shape{
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double getArea() {
        return pi*radius*radius;
    }
}
