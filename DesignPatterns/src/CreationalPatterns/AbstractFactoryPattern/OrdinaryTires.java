package CreationalPatterns.AbstractFactoryPattern;

public class OrdinaryTires implements Tires {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing ordinary tires with standard quality.");
    }
}
