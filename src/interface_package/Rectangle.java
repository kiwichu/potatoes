package interface_package;

public class Rectangle implements Shape{
    private double length;
    private double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return 0;
    }
}
