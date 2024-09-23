package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;


import BehavioralPatterns.StrategyPatterns.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    //This is known as the constructor injection
    Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive() {
        driveObject.drive();
    }
}
