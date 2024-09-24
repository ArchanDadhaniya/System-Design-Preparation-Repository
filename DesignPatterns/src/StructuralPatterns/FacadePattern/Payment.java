package StructuralPatterns.FacadePattern;


// Payment.java
public class Payment {
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
        return true; // Assume payment is successful
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding payment of $" + amount);
    }
}
