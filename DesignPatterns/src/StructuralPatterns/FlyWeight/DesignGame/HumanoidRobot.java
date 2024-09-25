package StructuralPatterns.FlyWeight.DesignGame;

public class HumanoidRobot implements IRobot {

    private String type;
    private Sprites body; // Small 2D bitmap (graphic element)

    HumanoidRobot(String type, Sprites body) {
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
        System.out.println("Displaying Humanoid Robot at coordinates (" + x + ", " + y + ")");
        // Use the humanoid sprite object and X, Y coordinate to render the image.
    }
}
