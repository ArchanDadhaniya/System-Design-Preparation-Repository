package CreationalPatterns.SingletonPattern.EagerInitialization;

public class DatabaseConnectionEager {
    private static final DatabaseConnectionEager instance = new DatabaseConnectionEager();

    private DatabaseConnectionEager() {
        // Initialize the database connection
        System.out.println("Eager Initialization: Database connection established.");
    }

    public static DatabaseConnectionEager getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database (Eager).");
    }
}

