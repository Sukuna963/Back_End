package Task;
/**
 * In this file you will find violation of LSP. You need to refactor this code.
 */
public class AreaCalculationOriginal {
    public static void main(String[] args) {
        RectangleOriginal rectangle = new RectangleOriginal();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

class RectangleOriginal {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class SquareOriginal extends RectangleOriginal {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
