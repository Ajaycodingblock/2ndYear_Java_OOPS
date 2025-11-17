// Demonstrating Inheritance, Access Modifiers, and Abstraction

// -----------------------------------------------------------
// 1. ABSTRACTION (abstract class)
// An abstract class can have abstract + non-abstract methods.
// -----------------------------------------------------------

abstract class Animal {

    // ---------------------------
    // ACCESS MODIFIERS EXAMPLE
    // ---------------------------

    public int leg;       // public: accessible everywhere
    protected int nose;   // protected: accessible in same package & subclasses
    String breed;         // default: accessible within same package
    private String name;  // private: accessible only inside this class

    // Setter method to set private variable (name)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return this.name;
    }

    // Non-abstract (normal) method
    public void printValues() {
        System.out.println("Nose : " + nose);
        System.out.println("Name : " + name);
    }

    // Abstract method (must be overridden in subclass)
    public abstract void sound();
}


// -----------------------------------------------------------
// 2. INHERITANCE
// Dog extends Animal → Dog is a child / subclass
// Animal is the parent / superclass
// -----------------------------------------------------------
class Dog extends Animal {

    // Overriding the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}


// -----------------------------------------------------------
// 3. MAIN CLASS
// -----------------------------------------------------------
public class Inheritance {
    public static void main(String[] args) {

        // Creating Dog object (child class)
        Dog d1 = new Dog();

        // Accessing public & protected variables
        d1.leg = 4;
        d1.nose = 1;

        // Setting private variable using setter
        d1.setName("Tommy");

        // Calling non-abstract method from parent class
        d1.printValues();

        // Calling overridden method (Abstraction)
        d1.sound();
    }
}
