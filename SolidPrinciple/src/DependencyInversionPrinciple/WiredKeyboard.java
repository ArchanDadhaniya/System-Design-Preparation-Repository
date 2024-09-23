package DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with a wired keyboard.");
    }
}