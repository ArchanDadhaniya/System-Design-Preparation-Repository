package DependencyInversionPrinciple;


public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;


    //This is known as the constructor injection.
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void use() {
        keyboard.type();
        mouse.click();
    }
}
