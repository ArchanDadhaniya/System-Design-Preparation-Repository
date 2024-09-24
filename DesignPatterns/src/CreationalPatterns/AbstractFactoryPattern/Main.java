package CreationalPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Creating a luxury car
        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine luxuryEngine = luxuryCarFactory.createEngine();
        Tires luxuryTires = luxuryCarFactory.createTires();

        luxuryEngine.design();  // Output: Designing a luxury engine with high performance and advanced features.
        luxuryTires.manufacture();  // Output: Manufacturing luxury tires with premium quality and durability.

        // Creating an ordinary car
        CarFactory ordinaryCarFactory = new OrdinaryCarFactory();
        Engine ordinaryEngine = ordinaryCarFactory.createEngine();
        Tires ordinaryTires = ordinaryCarFactory.createTires();

        ordinaryEngine.design();  // Output: Designing an ordinary engine with basic functionality.
        ordinaryTires.manufacture();  // Output: Manufacturing ordinary tires with standard quality.
    }
}



/*
Intent:-
         Provide an interface for creating families of related or dependent objects without specifying their
         concrete classes.
 */

