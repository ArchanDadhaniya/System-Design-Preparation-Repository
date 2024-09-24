package StructuralPatterns.FacadePattern;

// Main.java
// Main.java
public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Smartphone", 699.99);

        System.out.println("\nProcessing return...");

        ReturnFacade returnFacade = new ReturnFacade();
        returnFacade.returnOrder("Smartphone", 699.99);
    }
}


/*
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes
the subsystem easier to use.
 */