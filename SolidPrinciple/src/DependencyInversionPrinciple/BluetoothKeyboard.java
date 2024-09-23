package DependencyInversionPrinciple;

public class BluetoothKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with a Bluetooth keyboard.");
    }
}
