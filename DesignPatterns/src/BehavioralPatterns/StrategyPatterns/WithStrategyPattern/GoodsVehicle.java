package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;


import BehavioralPatterns.StrategyPatterns.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
