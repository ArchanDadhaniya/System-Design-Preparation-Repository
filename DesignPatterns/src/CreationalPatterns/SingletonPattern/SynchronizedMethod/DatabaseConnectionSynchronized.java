package CreationalPatterns.SingletonPattern.SynchronizedMethod;

public class DatabaseConnectionSynchronized {
    private static DatabaseConnectionSynchronized instance = null;

    private DatabaseConnectionSynchronized() {
        // Initialize the database connection
        System.out.println("Synchronized Method: Database connection established.");
    }

    public static synchronized DatabaseConnectionSynchronized getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionSynchronized();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database (Synchronized).");
    }
}

