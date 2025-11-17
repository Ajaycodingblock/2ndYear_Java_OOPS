// Abstraction Example in Java
// Abstraction = Hiding internal details and showing only essential features
// Achieved using: 
// 1. Abstract Class 
// 2. Interfaces (in advanced level)

// -------------------------------------------------------------
// ABSTRACT CLASS
// -------------------------------------------------------------
abstract class Animal {

    // Abstract method → no body, must be overridden in child class
    public abstract void sound();

    // Normal method → can be used directly
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class 1
class Dog extends Animal {

    // Implementing abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {

    // Implementing abstract method
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// -------------------------------------------------------------
// MAIN CLASS
// -------------------------------------------------------------
public class Abstraction {
    public static void main(String[] args) {

        // Using abstract class reference to refer to child objects

        Animal a;

        a = new Dog();      // parent reference → dog object
        a.sound();          // Dog's sound()
        a.sleep();          // inherited method

        System.out.println("------------------------");

        a = new Cat();      // parent reference → cat object
        a.sound();          // Cat's sound()
        a.sleep();          // inherited method
    }
}
