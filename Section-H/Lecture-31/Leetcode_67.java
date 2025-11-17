// File Name: Leetcode_67.java
// LeetCode 67: Add Binary
// Goal: Add two binary strings and return the sum as a binary string.

public class Leetcode_67 {

    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;  // pointer for string a
        int j = b.length() - 1;  // pointer for string b
        int carry = 0;           // carry for addition

        // Continue until both strings are finished and no carry remains
        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;  // start with carry

            if (i >= 0) {
                sum += a.charAt(i) - '0';  // convert char to int
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Add last bit (sum % 2) to result
            result.append(sum % 2);

            // Update carry (sum / 2)
            carry = sum / 2;
        }

        // result is reversed, so reverse before returning
        return result.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));     // Output: 100
        System.out.println(addBinary("1010", "1011")); // Output: 10101
    }
}
