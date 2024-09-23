package CreationalPatterns.AbstractFactoryPattern;

public class OrdinaryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new OrdinaryEngine();
    }

    @Override
    public Tires createTires() {
        return new OrdinaryTires();
    }
}


//Concrete Factory for Ordinary Cars