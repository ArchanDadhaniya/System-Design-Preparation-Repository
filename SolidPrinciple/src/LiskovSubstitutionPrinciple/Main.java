package LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for (Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}

/*
If class Shape serves as a base interface, then any subclass, such as Rectangle or Square, should be able to
replace an instance of Shape without altering the expected behavior of the program. Specifically, when a method
operates on a Shape object, it should produce consistent results regardless of whether the actual object is a
Rectangle or a Square, thereby maintaining the integrity of the program's logic and output.
 */