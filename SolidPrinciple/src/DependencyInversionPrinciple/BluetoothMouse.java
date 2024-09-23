package DependencyInversionPrinciple;

public class BluetoothMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Clicking with a Bluetooth mouse.");
    }
}
