package CreationalPatterns.FactoryPattern;

public class Main {


    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("Circle");
        shapeObj.draw();
    }
}


/*
Intent:-
         Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory
         Method lets a class defer instantiation to subclass.
 */