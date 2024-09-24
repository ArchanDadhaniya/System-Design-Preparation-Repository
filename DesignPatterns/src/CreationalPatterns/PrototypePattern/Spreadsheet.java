package CreationalPatterns.PrototypePattern;

// Spreadsheet.java
// Concrete class that extends Document to represent a Spreadsheet document
public class Spreadsheet extends Document {

    // Constructor to set the default title for Spreadsheet documents
    public Spreadsheet() {
        setTitle("Spreadsheet Document");
    }

    // Implementation of the abstract method from Document
    // Prints content specific to Spreadsheet documents
    @Override
    void printContent() {
        System.out.println("This is a Spreadsheet.");
    }
}

