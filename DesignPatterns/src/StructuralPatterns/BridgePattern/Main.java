package StructuralPatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {
        LivingThings fishObj = new Fish(new WaterBreathImplementation());
        fishObj.breatheProcess();
    }
}


/*
Decouple an abstraction from its implementation so that two can vary independently.
 */