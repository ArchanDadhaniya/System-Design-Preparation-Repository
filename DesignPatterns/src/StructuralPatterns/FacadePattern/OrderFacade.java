package StructuralPatterns.FacadePattern;

// OrderFacade.java
public class OrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderFacade() {
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
    }

    public void placeOrder(String product, double amount) {
        System.out.println("Starting order process...");
        if (inventory.checkStock(product)) {
            if (payment.processPayment(amount)) {
                shipping.shipProduct(product);
                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Payment failed!");
            }
        } else {
            System.out.println("Product is out of stock!");
        }
    }
}
