package BehavioralPatterns.StrategyPatterns.WithStrategyPattern;

public class Main {


    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
    }
}


/*
Intent:-
         Define a family of algorithms,encapsulate each one, and make them interchangeable. Strategy lets the algorithms
         vary independently from clients that use it.
 */