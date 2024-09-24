package StructuralPatterns.FacadePattern;

// ReturnFacade.java
public class ReturnFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public ReturnFacade() {
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
    }

    public void returnOrder(String product, double amount) {
        System.out.println("Starting return process...");
        shipping.returnProduct(product);
        inventory.restockProduct(product);
        payment.refundPayment(amount);
        System.out.println("Return processed successfully!");
    }
}
