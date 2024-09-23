package BehavioralPatterns.StrategyPatterns.WithStrategyPattern.Strategy;

public class XyzDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Xyz Drive Strategy");

    }
}
