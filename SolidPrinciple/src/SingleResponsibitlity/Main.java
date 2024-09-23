package SingleResponsibitlity;

public class Main {
    public static void main(String[] args) {
        // Create a book instance
        Book book = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        // Print book details using BookPrinter
        BookPrinter printer = new BookPrinter();
        printer.printBookDetails(book);

        // Save book to database using BookRepository
        BookRepository repository = new BookRepository();
        repository.saveToDatabase(book);
    }
}






// Rule for the Open/ Cloe Principle is " A Class should have only 1 reason to change "