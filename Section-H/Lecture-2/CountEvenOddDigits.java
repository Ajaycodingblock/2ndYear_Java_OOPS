// Program 6: Count Even and Odd digits in a number
public class CountEvenOddDigits {
    public static void main(String[] args) {
        int num = 1234567;
        int even = 0, odd = 0;

        // Extract digits
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
