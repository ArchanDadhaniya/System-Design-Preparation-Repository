package OpenClosePrinciple;


public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save(){
        // Save Invoice into the DB
    }

    public void saveToFile(String filename){
        // Save Invoice in the file with the given name
    }
}



/*
This is class implementation we add the method and we didn't follow the open close principle
because we modify the class which not allow in the open close principle
 */