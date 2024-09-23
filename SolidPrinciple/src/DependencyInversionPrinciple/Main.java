package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        // Example with wired keyboard and wired mouse
        Keyboard wiredKeyboard = new WiredKeyboard();
        Mouse wiredMouse = new WiredMouse();
        MacBook macBookWired = new MacBook(wiredKeyboard, wiredMouse);
        System.out.println("Using wired devices:");
        macBookWired.use();

        // Example with Bluetooth keyboard and Bluetooth mouse
        Keyboard bluetoothKeyboard = new BluetoothKeyboard();
        Mouse bluetoothMouse = new BluetoothMouse();
        MacBook macBookBluetooth = new MacBook(bluetoothKeyboard, bluetoothMouse);
        System.out.println("Using Bluetooth devices:");
        macBookBluetooth.use();
    }
}



/*
Class Should depend on interface rather than concrete class
 */