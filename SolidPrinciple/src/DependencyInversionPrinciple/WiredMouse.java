package DependencyInversionPrinciple;

public class WiredMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Clicking with a wired mouse.");
    }
}
