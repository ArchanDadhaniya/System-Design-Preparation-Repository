package CreationalPatterns.SingletonPattern.DoubleCheckedLocking;

public class DatabaseConnectionDoubleChecked {
    private static volatile DatabaseConnectionDoubleChecked instance = null;

    private DatabaseConnectionDoubleChecked() {
        // Initialize the database connection
        System.out.println("Double-Checked Locking: Database connection established.");
    }

    public static DatabaseConnectionDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionDoubleChecked.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionDoubleChecked();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database (Double-Checked Locking).");
    }
}

