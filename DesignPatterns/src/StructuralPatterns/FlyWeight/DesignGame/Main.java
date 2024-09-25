package StructuralPatterns.FlyWeight.DesignGame;

public class Main {

    public static void main(String args[]) {

        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10, 30);

        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2, 9);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11, 19);

        // Verify that objects are shared
        System.out.println("HumanoidRobot1 == HumanoidRobot2: " + (humanoidRobot1 == humanoidRobot2)); // Should be true
        System.out.println("RoboDog1 == RoboDog2: " + (roboDog1 == roboDog2)); // Should be true
    }
}
