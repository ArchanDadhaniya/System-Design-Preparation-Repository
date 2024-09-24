package CreationalPatterns.PrototypePattern;

// PrototypeDemo.java
// Client class demonstrating how to use the Prototype pattern with Document objects
public class Main {

    public static void main(String[] args) {
        // Load prototypes into the cache
        DocumentCache.loadCache();

        // Retrieve a cloned Word document from the cache
        Document clonedWordDoc = DocumentCache.getDocument("Word");
        // Print the type of the cloned document and its content
        System.out.println("Document Type: " + clonedWordDoc.getTitle());
        clonedWordDoc.printContent();

        // Retrieve a cloned Spreadsheet document from the cache
        Document clonedSpreadsheet = DocumentCache.getDocument("Spreadsheet");
        // Print the type of the cloned document and its content
        System.out.println("Document Type: " + clonedSpreadsheet.getTitle());
        clonedSpreadsheet.printContent();

        // Retrieve a cloned Presentation document from the cache
        Document clonedPresentation = DocumentCache.getDocument("Presentation");
        // Print the type of the cloned document and its content
        System.out.println("Document Type: " + clonedPresentation.getTitle());
        clonedPresentation.printContent();
    }
}



/*
The main class demonstrates how to use the Prototype pattern. Instead of creating new documents,
it retrieves cloned copies from the DocumentCache.
 */