// File name: Leetcode485.java
// Problem: LeetCode 485 - Max Consecutive Ones
// Given a binary array, return the maximum number of consecutive 1s in the array.

// We use a single pass linear scan, keeping a current count of consecutive 1s
// and updating the maximum when a 0 is encountered.
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Leetcode485 {

    // Returns the maximum number of consecutive 1s in the array
    public static int maxConsecutiveOnes(int[] nums) {
        int maxCount = 0;      // stores the maximum seen so far
        int currentCount = 0;  // counts current run of 1s

        for (int n : nums) {
            if (n == 1) {
                currentCount++;              // extend current run
                if (currentCount > maxCount) // update max if needed
                    maxCount = currentCount;
            } else {
                // reset current run when we see a 0
                currentCount = 0;
            }
        }

        return maxCount;
    }

    // Simple main to test the method with examples
    public static void main(String[] args) {
        // Example 1: expected output 3 (three consecutive 1s at the end)
        int[] nums1 = {1,1,0,1,1,1};
        System.out.println("Input: {1,1,0,1,1,1} -> Max Consecutive Ones = " + maxConsecutiveOnes(nums1));

        // Example 2: expected output 2
        int[] nums2 = {1,0,1,1,0,1};
        System.out.println("Input: {1,0,1,1,0,1} -> Max Consecutive Ones = " + maxConsecutiveOnes(nums2));

        // Edge cases
        int[] nums3 = {0,0,0}; // expected 0
        System.out.println("Input: {0,0,0} -> Max Consecutive Ones = " + maxConsecutiveOnes(nums3));

        int[] nums4 = {1,1,1,1}; // expected 4
        System.out.println("Input: {1,1,1,1} -> Max Consecutive Ones = " + maxConsecutiveOnes(nums4));
    }
}
