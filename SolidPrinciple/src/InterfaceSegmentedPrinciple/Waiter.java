package InterfaceSegmentedPrinciple;



public class Waiter implements WaiterInterface {
    @Override
    public void serveCustomer() {
        System.out.println("Serving customer...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }
}
