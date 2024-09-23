package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
