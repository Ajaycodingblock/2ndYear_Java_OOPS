// Program 1: Maximum of 3 numbers using if-else
public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        // Compare numbers using if-else
        if (a >= b && a >= c) {
            System.out.println("Maximum is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum is: " + b);
        } else {
            System.out.println("Maximum is: " + c);
        }
    }
}
