package Polymorphism;

// PolymorphismCompileTime.java
// Compile time polymorphism is also known as the "Method Over Loading"

class MathUtil {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismCompileTime {
    public static void main(String[] args) {
        MathUtil util = new MathUtil();
        System.out.println(util.add(5, 10));       // int version
        System.out.println(util.add(5.5, 10.5));   // double version
    }
}
