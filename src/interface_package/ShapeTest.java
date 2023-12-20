package interface_package;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8.5, 5.6);
        printShapeArea(rectangle);

        Circle circle = new Circle(9.3);
        printShapeArea(circle);

        Shape triangle = new Triangle(6, 5);
        printShapeArea(triangle);

    }

        public static void printShapeArea(Shape shape){
            System.out.println(shape.getArea());

        }
    }

 /*   public void printCircleArea(Circle circle){
        System.out.println(circle.getArea());
    }
    public void printRectangleArea(Rectangle rectangle){
        System.out.println(rectangle.getArea());
    }
    public void printTriangleArea(Triangle triangle){
        System.out.println(triangle.getArea());
    }

  */

