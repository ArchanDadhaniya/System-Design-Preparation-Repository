package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle {


    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
