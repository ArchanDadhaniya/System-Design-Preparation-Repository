package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
