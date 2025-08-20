package Abstraction;

// AbstractionExample.java

abstract class Shape {
    abstract void draw(); // abstract method

    public void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        s.draw();
    }
}
