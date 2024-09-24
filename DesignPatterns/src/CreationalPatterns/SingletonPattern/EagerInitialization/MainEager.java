package CreationalPatterns.SingletonPattern.EagerInitialization;

public class MainEager {
    public static void main(String[] args) {
        DatabaseConnectionEager dbConnection = DatabaseConnectionEager.getInstance();
        dbConnection.connect();
    }
}

/*
Pros:
     Simple and straightforward.
     Thread-safe without requiring synchronized blocks.
Cons:
     Instance is created even if it is never used, which can be resource-intensive.
 */