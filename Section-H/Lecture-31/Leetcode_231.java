// File Name: Leetcode_231.java
// LeetCode 231: Power of Two
// Goal: Check if a number is a power of 2 (1, 2, 4, 8, 16, ...)

public class Leetcode_231 {

    // Method 1: Using simple loop (beginner-friendly)
    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false; // power of 2 is always positive
        }

        // keep dividing by 2 while divisible
        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1; // if final value is 1 → power of 2
    }

    // Method 2: BEST (Bit Manipulation)
    // n & (n-1) == 0 → means only one bit is set (power of 2)
    public static boolean isPowerOfTwoBit(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(16));   // true
        System.out.println(isPowerOfTwo(18));   // false

        System.out.println(isPowerOfTwoBit(32)); // true
        System.out.println(isPowerOfTwoBit(7));  // false
    }
}
