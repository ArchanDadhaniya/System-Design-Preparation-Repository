package CreationalPatterns.SingletonPattern.LazyInitialization;

public class MainLazy {
    public static void main(String[] args) {
        DatabaseConnectionLazy dbConnection = DatabaseConnectionLazy.getInstance();
        dbConnection.connect();
    }
}

/*
Pros:
      Instance is created only when needed.
Cons:
      Not thread-safe, may lead to multiple instances in a multithreaded environment.

 */