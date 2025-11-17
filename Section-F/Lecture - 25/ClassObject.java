// A simple class named Car
class Car {

    // Data members (attributes)
    String name;
    String color;
    int price;

    // Member function (method)
    public void printDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price);
    }
}

// Main class to create objects
public class ClassObject {
    public static void main(String[] args) {

        // Creating an object of Car class
        Car c1 = new Car();

        // Initializing object data
        c1.name = "Toyota Innova";
        c1.color = "White";
        c1.price = 2000000;

        // Calling method using object
        c1.printDetails();

        System.out.println("----------------------------");

        // Creating another object
        Car c2 = new Car();
        c2.name = "Honda City";
        c2.color = "Silver";
        c2.price = 1500000;

        // Printing details of second object
        c2.printDetails();
    }
}
