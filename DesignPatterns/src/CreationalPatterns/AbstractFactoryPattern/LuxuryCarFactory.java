package CreationalPatterns.AbstractFactoryPattern;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Tires createTires() {
        return new LuxuryTires();
    }
}

//Concrete Factory for Luxury Cars