package Polymorphism;

// PolymorphismRunTime.java
// Run time polymorphism is also known for the  "Method Over Ridding"

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismRuntime {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // upcasting
        myAnimal.sound(); // Dog's version is called at runtime
    }
}
