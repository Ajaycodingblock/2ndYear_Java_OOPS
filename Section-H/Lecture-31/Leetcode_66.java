// File Name: Leetcode_66.java

// Leetcode 66: Plus One
// Add 1 to the number represented by digit array

public class Leetcode_66 {

    public static int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;     // Add 1 if digit < 9
                return digits;   // No more carry
            }

            digits[i] = 0; // If digit is 9, make it 0 (carry)
        }

        // If all digits were 9 → new array needed
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;   // Example: [9,9] → [1,0,0]
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] result = plusOne(arr);

        for (int x : result) {
            System.out.print(x + " "); // Output: 1 0 0 0
        }
    }
}
