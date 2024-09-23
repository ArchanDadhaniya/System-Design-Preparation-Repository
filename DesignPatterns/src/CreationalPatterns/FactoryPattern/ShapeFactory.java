package CreationalPatterns.FactoryPattern;

public class ShapeFactory {

    Shape getShape(String input) {

        switch (input) {
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }

    }
}
