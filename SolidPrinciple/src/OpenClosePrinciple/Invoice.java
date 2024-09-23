package OpenClosePrinciple;



public class Invoice {
    private OpenClosePrinciple.Marker marker;
    public int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculatePrice(){
        int price = ((marker.price)*this.quantity);
        return price;
    }
}