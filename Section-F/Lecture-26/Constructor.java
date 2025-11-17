

class Student {

    String name;
    int roll;
    int marks;

    // Default Constructor
    Student() {
        this.name = "Not Assigned";
        this.roll = 0;
        this.marks = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(String name, int roll, int marks) {
        this.name = name;      // using 'this' keyword
        this.roll = roll;
        this.marks = marks;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;    // copying from object s
        this.roll = s.roll;
        this.marks = s.marks;
        System.out.println("Copy Constructor Called");
    }

    public void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
        System.out.println("Marks: " + this.marks);
        System.out.println("---------------------------");
    }
}

public class Constructor {
    public static void main(String[] args) {

        // Default Constructor
        Student s1 = new Student();
        s1.showDetails();

        // Parameterized Constructor (Tony)
        Student tony = new Student("Tony", 101, 95);
        tony.showDetails();

        // Parameterized Constructor (Captain America)
        Student cap = new Student("Captain America", 102, 90);
        cap.showDetails();

        // Copy Constructor (copy of Captain America)
        Student copyCap = new Student(cap);
        copyCap.showDetails();
    }
}
