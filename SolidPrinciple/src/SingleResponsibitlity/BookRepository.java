package SingleResponsibitlity;

public class BookRepository {
    public void saveToDatabase(Book book) {
        System.out.println("Saving book to the database: " + book.getTitle());
        // Logic for saving to a database can be added here
    }
}
