package Task;

import java.util.List;

/*

In this file you can find violation of Open / Closed Principle. 
You should refactor this file. 
You can remove this file completely, because it will not be used during the evaluation of the solution.

*/

public class ShapeCalculatorOriginal {
    public double calculateTotalArea(List<ShapeOriginal> shapes) {
        double totalArea = 0;
        for (ShapeOriginal shape : shapes) {
            if (shape instanceof CircleOriginal) {
                CircleOriginal circle = (CircleOriginal) shape;
                totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
            } else if (shape instanceof RectangleOriginal) {
                RectangleOriginal rectangle = (RectangleOriginal) shape;
                totalArea += rectangle.getWidth() * rectangle.getHeight();
            }
            // Add more conditions for other shapes (e.g., Triangle)
        }
        return totalArea;
    }
}

class ShapeOriginal {
    // Common properties and methods for all shapes
}

class CircleOriginal extends ShapeOriginal {
    private double radius;

    public CircleOriginal(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class RectangleOriginal extends ShapeOriginal {
    private double width;
    private double height;

    public RectangleOriginal(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
