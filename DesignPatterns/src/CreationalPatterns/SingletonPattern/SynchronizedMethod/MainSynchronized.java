package CreationalPatterns.SingletonPattern.SynchronizedMethod;

public class MainSynchronized {
    public static void main(String[] args) {
        DatabaseConnectionSynchronized dbConnection = DatabaseConnectionSynchronized.getInstance();
        dbConnection.connect();
    }
}

/*
Pros:
      Ensures that only one thread can access the method at a time.
Cons:
      Performance overhead due to synchronization, especially if many threads access the method concurrently.

 */