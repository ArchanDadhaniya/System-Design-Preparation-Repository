package CreationalPatterns.PrototypePattern;

// Presentation.java
// Concrete class that extends Document to represent a Presentation document
public class Presentation extends Document {

    // Constructor to set the default title for Presentation documents
    public Presentation() {
        setTitle("Presentation Document");
    }

    // Implementation of the abstract method from Document
    // Prints content specific to Presentation documents
    @Override
    void printContent() {
        System.out.println("This is a Presentation.");
    }
}


