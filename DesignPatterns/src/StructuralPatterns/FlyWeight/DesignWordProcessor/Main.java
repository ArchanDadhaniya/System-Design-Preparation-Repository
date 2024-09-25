package StructuralPatterns.FlyWeight.DesignWordProcessor;

public class Main {

    public static void main(String[] args) {

        /*
            This is the data we want to write into the word processor.

            Total = 58 characters
            t = 7 times
            h = 3 times
            a = 3 times and so on...
         */

        ILetter object1 = LetterFactory.createLetter('t');
        object1.display(0, 0);

        ILetter object2 = LetterFactory.createLetter('t');
        object2.display(0, 6); // Used object2 instead of object1

        // Add more characters to demonstrate the Flyweight pattern
        ILetter object3 = LetterFactory.createLetter('h');
        object3.display(0, 1);

        ILetter object4 = LetterFactory.createLetter('a');
        object4.display(0, 2);

        // Checking if the same 't' object is shared
        System.out.println("Object1 == Object2: " + (object1 == object2)); // Should be true
    }
}


/*
Intent:-
         Use sharing to support large numbers of fine-grained objects efficiently.
 */