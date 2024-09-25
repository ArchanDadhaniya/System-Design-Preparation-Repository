package StructuralPatterns.FlyWeight.DesignGame;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RoboticFactory {

    // Thread-safe map to cache created robots
    private static Map<String, IRobot> roboticObjectCache = new ConcurrentHashMap<>();

    public static IRobot createRobot(String robotType) {

        // Check if the robot already exists in the cache
        if (roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        } else {
            IRobot robot = null;
            Sprites sprite = new Sprites(); // This can be extended to load different sprites for different robot types

            if (robotType.equals("HUMANOID")) {
                robot = new HumanoidRobot(robotType, sprite);
            } else if (robotType.equals("ROBOTICDOG")) {
                robot = new RoboticDog(robotType, sprite);
            }

            // Add the new robot to the cache
            if (robot != null) {
                roboticObjectCache.put(robotType, robot);
            }
            return robot;
        }
    }
}
