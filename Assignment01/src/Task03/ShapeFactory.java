package Task03;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toUpperCase()) {
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                System.out.println("Invalid shape type: " + shapeType);
                return null;
        }
    }
}

