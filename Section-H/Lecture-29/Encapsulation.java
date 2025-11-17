// Encapsulation Example in Java
// Encapsulation = Binding data (variables) and methods (functions) together
// and restricting direct access using private keyword

class Student {

    // Private variables → cannot be accessed directly from outside
    private String name;
    private int age;

    // Setter method → used to set value into private variable
    public void setName(String name) {
        this.name = name;     // using 'this' to refer to current object
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter method → used to get value of private variable
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Tony Stark");
        s1.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
