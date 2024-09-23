package CreationalPatterns.AbstractFactoryPattern;

public class OrdinaryEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing an ordinary engine with basic functionality.");
    }
}

//Ordinary Engine Product