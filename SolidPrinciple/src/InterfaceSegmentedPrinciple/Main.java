package InterfaceSegmentedPrinciple;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        // Chef actions
        chef.decideMenu();
        chef.cookFood();

        // Waiter actions
        waiter.takeOrder();
        waiter.serveCustomer();
    }
}

/*
The Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use.
In other words, interfaces should be designed to be specific to the clients that implement them rather than creating
large, general-purpose interfaces. This leads to a more modular design, making the code easier to maintain and understand.
 */