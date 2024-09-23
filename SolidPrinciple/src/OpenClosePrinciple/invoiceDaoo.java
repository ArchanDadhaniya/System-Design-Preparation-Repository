package OpenClosePrinciple;

public interface invoiceDaoo {

    public void save(Invoice invoice);
}


class DatabaseInvoiceDaoo implements invoiceDaoo {

    @Override
    public void save(Invoice invoice) {
        //save to db
    }
}


class FileInvoiceDaoo implements invoiceDaoo {

    @Override
    public void save(Invoice invoice) {
        //save to file
    }
}


/*
here we make an interface of the invoiceDaoo and use to implement the invoiceDaoo for the save to DB and save for file.
 */