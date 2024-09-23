package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;

import BehavioralPatterns.StrategyPatterns.WithStrategyPattern.Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle {


    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
