package CreationalPatterns.SingletonPattern;

import CreationalPatterns.SingletonPattern.DoubleCheckedLocking.DatabaseConnectionDoubleChecked;
import CreationalPatterns.SingletonPattern.EagerInitialization.DatabaseConnectionEager;
import CreationalPatterns.SingletonPattern.LazyInitialization.DatabaseConnectionLazy;
import CreationalPatterns.SingletonPattern.SynchronizedMethod.DatabaseConnectionSynchronized;

public class Main {
    public static void main(String[] args) {
        // Test Eager Initialization
        DatabaseConnectionEager eagerConnection = DatabaseConnectionEager.getInstance();
        eagerConnection.connect();

        // Test Lazy Initialization
        DatabaseConnectionLazy lazyConnection = DatabaseConnectionLazy.getInstance();
        lazyConnection.connect();

        // Test Synchronized Method
        DatabaseConnectionSynchronized synchronizedConnection = DatabaseConnectionSynchronized.getInstance();
        synchronizedConnection.connect();

        // Test Double-Checked Locking
        DatabaseConnectionDoubleChecked doubleCheckedConnection = DatabaseConnectionDoubleChecked.getInstance();
        doubleCheckedConnection.connect();
    }
}

