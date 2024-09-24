package CreationalPatterns.PrototypePattern;

// Document.java
// Abstract class representing a document and implementing the Cloneable interface
public abstract class Document implements Cloneable {

    // Each document has a title
    private String title;

    // Getter for the document title
    public String getTitle() {
        return title;
    }

    // Setter for the document title
    public void setTitle(String title) {
        this.title = title;
    }

    // Abstract method to print the content of the document, to be implemented by subclasses
    abstract void printContent();

    // Method to clone the document
    // Uses the built-in Object.clone() method to create a copy of the document
    public Document clone() {
        Document clone = null;
        try {
            // Perform a shallow copy of the object
            clone = (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}



/*
The Document class defines the structure for all document types and provides a method to clone documents using
the clone() method. This is the abstract class that other document types extend.
 */