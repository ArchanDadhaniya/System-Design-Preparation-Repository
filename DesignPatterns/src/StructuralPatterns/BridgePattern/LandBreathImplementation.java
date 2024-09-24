package StructuralPatterns.BridgePattern;

public class LandBreathImplementation implements BreatheImplementor{

    @Override
    public void breathe() {
        System.out.println("Land Breath");
    }
}
