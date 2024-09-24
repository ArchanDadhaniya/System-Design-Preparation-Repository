package CreationalPatterns.SingletonPattern.DoubleCheckedLocking;

public class MainDoubleChecked {
    public static void main(String[] args) {
        DatabaseConnectionDoubleChecked dbConnection = DatabaseConnectionDoubleChecked.getInstance();
        dbConnection.connect();
    }
}


/*
Pros:
      Combines lazy initialization with thread safety.
      Better performance than synchronized method.

Cons:
      Slightly more complex to implement.
 */