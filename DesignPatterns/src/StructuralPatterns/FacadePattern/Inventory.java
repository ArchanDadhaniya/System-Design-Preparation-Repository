package StructuralPatterns.FacadePattern;

// Inventory.java
// Inventory.java
public class Inventory {
    public boolean checkStock(String product) {
        System.out.println("Checking stock for " + product);
        return true; // Assume the product is in stock
    }

    public void restockProduct(String product) {
        System.out.println("Restocking " + product);
    }
}

