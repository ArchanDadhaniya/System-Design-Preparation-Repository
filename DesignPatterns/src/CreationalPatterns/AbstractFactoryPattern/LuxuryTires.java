package CreationalPatterns.AbstractFactoryPattern;

public class LuxuryTires implements Tires {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing luxury tires with premium quality and durability.");
    }
}
