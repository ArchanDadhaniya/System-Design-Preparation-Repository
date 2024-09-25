package StructuralPatterns.FlyWeight.DesignGame;

public class RoboticDog implements IRobot {

    private String type;
    private Sprites body; // Small 2D bitmap (graphic element)

    RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying Robotic Dog at coordinates (" + x + ", " + y + ")");
        // Use the Robotic Dog sprite object and X, Y coordinate to render the image.
    }
}
