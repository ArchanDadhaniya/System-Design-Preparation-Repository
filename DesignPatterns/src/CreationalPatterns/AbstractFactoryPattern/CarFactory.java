package CreationalPatterns.AbstractFactoryPattern;

public interface CarFactory {
    Engine createEngine();
    Tires createTires();
}

