package CreationalPatterns.SingletonPattern.LazyInitialization;

public class DatabaseConnectionLazy {
    private static DatabaseConnectionLazy instance = null;

    private DatabaseConnectionLazy() {
        // Initialize the database connection
        System.out.println("Lazy Initialization: Database connection established.");
    }

    public static DatabaseConnectionLazy getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionLazy();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database (Lazy).");
    }
}

