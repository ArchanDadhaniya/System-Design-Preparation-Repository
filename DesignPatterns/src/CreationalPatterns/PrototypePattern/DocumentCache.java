package CreationalPatterns.PrototypePattern;

// DocumentCache.java
// Prototype registry class that stores prototypes of different document types
import java.util.HashMap;
import java.util.Map;

public class DocumentCache {

    // A map to hold the document prototypes, using their type as the key
    private static Map<String, Document> documentMap = new HashMap<>();

    // Method to retrieve a document clone from the cache based on document type
    public static Document getDocument(String docType) {
        // Fetch the cached document and return a cloned copy of it
        Document cachedDocument = documentMap.get(docType);
        return cachedDocument.clone();
    }

    // Method to load some predefined document types into the cache
    public static void loadCache() {
        // Create and store a Word document prototype
        WordDocument wordDoc = new WordDocument();
        documentMap.put("Word", wordDoc);

        // Create and store a Spreadsheet document prototype
        Spreadsheet spreadsheet = new Spreadsheet();
        documentMap.put("Spreadsheet", spreadsheet);

        // Create and store a Presentation document prototype
        Presentation presentation = new Presentation();
        documentMap.put("Presentation", presentation);
    }
}



/*
The DocumentCache class stores initial instances of different document types. Instead of creating new documents
from scratch, the client can request a clone of an existing document from the cache.
 */