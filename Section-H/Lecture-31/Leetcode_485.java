// File Name: Leetcode_485.java

// Leetcode 485: Max Consecutive Ones
// Count maximum continuous 1s in a binary array

public class Leetcode_485 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;      // Current streak of 1s
        int maxCount = 0;   // Maximum streak found

        for (int x : nums) {

            if (x == 1) {
                count++;                              // Increase streak
                maxCount = Math.max(maxCount, count); // Update max
            } else {
                count = 0;  // Reset when 0 comes
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr)); // Output: 3
    }
}
