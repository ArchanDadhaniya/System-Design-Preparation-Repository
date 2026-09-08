package CreationalPatterns.SingletonPattern;

import CreationalPatterns.SingletonPattern.DoubleCheckedLocking.DatabaseConnectionDoubleChecked;
import CreationalPatterns.SingletonPattern.EagerInitialization.DatabaseConnectionEager;
import CreationalPatterns.SingletonPattern.LazyInitialization.DatabaseConnectionLazy;
import CreationalPatterns.SingletonPattern.SynchronizedMethod.DatabaseConnectionSynchronized;

public class Main {
    public static void main(String[] args) {
        // Test Eager Initialization
        System.out.println("------------------EAGER Initialization------------------");
        DatabaseConnectionEager eagerConnection = DatabaseConnectionEager.getInstance();
        eagerConnection.connect();

        // Test Lazy Initialization
        System.out.println("------------------Lazy Initialization------------------");
        DatabaseConnectionLazy lazyConnection = DatabaseConnectionLazy.getInstance();
        lazyConnection.connect();

        // Test Synchronized Method
        System.out.println("------------------Synchronized Initialization------------------");
        DatabaseConnectionSynchronized synchronizedConnection = DatabaseConnectionSynchronized.getInstance();
        synchronizedConnection.connect();

        // Test Double-Checked Locking
        System.out.println("------------------Double-Checked Initialization------------------");
        DatabaseConnectionDoubleChecked doubleCheckedConnection = DatabaseConnectionDoubleChecked.getInstance();
        doubleCheckedConnection.connect();
    }
}


/*
Intent:- Ensure a class only one instance, and provide a global point of access to it.
*/