package Inheritance;

// InheritanceExample.java

// Parent class
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited method
        dog.bark(); // own method
    }
}
