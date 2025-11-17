// Polymorphism Example in Java
// Polymorphism = "One name, many forms"
// Two Types:
// 1. Compile-Time Polymorphism (Method Overloading)
// 2. Runtime Polymorphism (Method Overriding)

// -------------------------------------------------------
// 1. COMPILE-TIME POLYMORPHISM → METHOD OVERLOADING
// -------------------------------------------------------
class MathOperation {

    // Same method name, different number of parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Same method name, different type of parameter
    public double add(double a, double b) {
        return a + b;
    }

    // Same method name, different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// -------------------------------------------------------
// 2. RUNTIME POLYMORPHISM → METHOD OVERRIDING
// -------------------------------------------------------

class Animal {

    // Parent class method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {

    // Overriding parent method
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// -------------------------------------------------------
// MAIN CLASS
// -------------------------------------------------------
public class Polymorphism {
    public static void main(String[] args) {

        // Compile-time Polymorphism (Method Overloading)
        MathOperation m = new MathOperation();
        System.out.println("Add 2 numbers: " + m.add(5, 10));
        System.out.println("Add 3 numbers: " + m.add(5, 10, 15));
        System.out.println("Add double values: " + m.add(2.5, 3.7));

        System.out.println("----------------------------");

        // Runtime Polymorphism (Method Overriding)
        Animal a;

        a = new Dog();   // parent reference, child object
        a.sound();       // Dog's sound()

        a = new Cat();   // parent reference, child object
        a.sound();       // Cat's sound()
    }
}
