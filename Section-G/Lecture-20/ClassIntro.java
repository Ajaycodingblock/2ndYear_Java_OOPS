// Class representing a Toyota car
class Toyota {
    // Instance variables
    String model;
    String name;
    int price;
    int seat;

    // Method to print car details
    public void prt() {
        System.out.println("Model: " + model);
        System.out.println("Owner: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

// Class representing a Restaurant
class Restaurant {
    // Instance variables
    String food;
    int price;
    int seat;
    String booking;

    // Method to print restaurant details
    public void prt() {
        System.out.println("Booking: " + booking);
        System.out.println("Price: " + price);
        System.out.println("Seats: " + seat);
        System.out.println("Food: " + food);
        System.out.println();
    }
}

// Main class
public class ClassIntro {
    public static void main(String[] args) {

        // Creating first Toyota object
        Toyota f1 = new Toyota();
        f1.model = "Fortuner";
        f1.name = "Tony";
        f1.price = 4500000;
        f1.prt();

        // Creating second Toyota object
        Toyota f2 = new Toyota();
        f2.model = "Hilux";
        f2.name = "Captain America";
        f2.price = 5500000;
        f2.prt();

        // Creating Restaurant object
        Restaurant c1 = new Restaurant();

        // Before booking
        System.out.println("Before Booking:");
        c1.prt();

        // Setting restaurant details after booking
        c1.booking = "Yes";
        c1.food = "South Indian";
        c1.price = 4000;
        c1.seat = 4;

        // After booking
        System.out.println("After Booking:");
        c1.prt();

        // Printing specific booking status
        System.out.println("Booking Status: " + c1.booking);
    }
}
