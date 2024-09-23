package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;

import BehavioralPatterns.StrategyPatterns.WithStrategyPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
