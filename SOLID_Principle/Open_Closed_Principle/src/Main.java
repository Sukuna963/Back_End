import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ShapeCalculatorOriginal shapeCalculator = new ShapeCalculatorOriginal();
        Rectangle rectangle = new Rectangle(20.0, 10.0);
        Circle circle = new Circle(90.0);
        Triangle triangle = new Triangle(50.0, 120.0);

        List <Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(triangle);

        System.out.println(shapeCalculator.calculateTotalArea(shapes)); 
    }
}
