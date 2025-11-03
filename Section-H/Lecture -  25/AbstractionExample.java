// Topic: Abstraction in Java
// Remark: Taught in class — explained abstraction using abstract classes and methods.


// Abstract class – cannot be instantiated
abstract class Shape {

    // Abstract method (no implementation)
    // Forces subclasses to provide their own implementation
    abstract void draw();

    // Concrete (non-abstract) method
    // Can be shared by all subclasses
    void displayInfo() {
        System.out.println("All shapes have an area and a boundary.");
    }
}

// Concrete subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to demonstrate abstraction
public class AbstractionExample {
    public static void main(String[] args) {

        // Shape s = new Shape(); ❌ Not allowed — abstract class cannot be instantiated

        Shape circle = new Circle();       // Upcasting: Reference of abstract type
        Shape rectangle = new Rectangle(); // Upcasting again

        circle.draw();      // Calls Circle's draw()
        rectangle.draw();   // Calls Rectangle's draw()

        // Calling a concrete method from abstract class
        circle.displayInfo();
    }
}
