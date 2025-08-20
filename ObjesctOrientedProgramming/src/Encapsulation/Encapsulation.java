package Encapsulation;


// EncapsulationExample.java
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);

        // Using getter
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        // Using setter to update values
        p.setName("Bob");      // using setName()
        p.setAge(30);          // using setAge()

        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());
    }
}
