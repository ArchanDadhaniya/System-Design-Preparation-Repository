package BehavioralPatterns.StrategyPatterns.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Normal Drive Strategy");
    }
}