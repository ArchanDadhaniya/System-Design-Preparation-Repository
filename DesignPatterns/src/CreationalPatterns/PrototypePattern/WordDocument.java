package CreationalPatterns.PrototypePattern;

// WordDocument.java
// Concrete class that extends Document to represent a Word document
public class WordDocument extends Document {

    // Constructor to set the default title for Word documents
    public WordDocument() {
        setTitle("Word Document");
    }

    // Implementation of the abstract method from Document
    // Prints content specific to Word documents
    @Override
    void printContent() {
        System.out.println("This is a Word Document.");
    }
}

