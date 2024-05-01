import java.util.List;

public class ShapeCalculatorOriginal {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
            
        if (shapes == null || shapes.size() == 0) {
            return totalArea;
        }
            
        for (Shape shape : shapes) {
            if(shape != null) {
                totalArea += shape.calculatelArea();
            }
        }
            
        return totalArea;
    }
}
