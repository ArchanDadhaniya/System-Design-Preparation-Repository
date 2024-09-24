package StructuralPatterns.BridgePattern;

public class WaterBreathImplementation implements BreatheImplementor{

    @Override
    public void breathe() {
        System.out.println("Water breathe");
    }
}
