package StructuralPatterns.FacadePattern;

// Shipping.java
public class Shipping {
    public void shipProduct(String product) {
        System.out.println("Shipping " + product);
    }

    public void returnProduct(String product) {
        System.out.println("Returning " + product);
    }
}
