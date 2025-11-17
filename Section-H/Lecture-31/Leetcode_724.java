// File Name: Leetcode_724.java
// LeetCode 724: Find Pivot Index
// Contains TWO approaches:
// 1) Optimized Prefix Sum Approach
// 2) Left Array + Right Array Approach

public class Leetcode_724 {

    // ---------------------------------------------------------
    // APPROACH 1: PREFIX SUM (Optimized)
    // Time: O(n), Space: O(1)
    // ---------------------------------------------------------
    public static int pivotIndex_Optimized(int[] nums) {

        int totalSum = 0;

        // Step 1: Calculate total sum
        for (int val : nums) {
            totalSum += val;
        }

        int leftSum = 0;

        // Step 2: Check pivot condition at each index
        for (int i = 0; i < nums.length; i++) {

            // Right sum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;   // pivot found
            }

            leftSum += nums[i];  // update left sum
        }

        return -1;  // no pivot found
    }


    // ---------------------------------------------------------
    // APPROACH 2: LEFT ARRAY + RIGHT ARRAY
    // Time: O(n), Space: O(n)
    // ---------------------------------------------------------
    public static int pivotIndex_LeftRightArray(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];   // left sum array
        int[] right = new int[n];  // right sum array

        // Build left sum array
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }

        // Build right sum array
        right[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }

        // Compare left and right arrays
        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;   // pivot found
            }
        }

        return -1;  // no pivot found
    }


    // ---------------------------------------------------------
    // MAIN METHOD TO TEST BOTH APPROACHES
    // ---------------------------------------------------------
    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println("Approach 1 (Optimized): " + pivotIndex_Optimized(arr));        // Output: 3
        System.out.println("Approach 2 (Left+Right): " + pivotIndex_LeftRightArray(arr)); // Output: 3
    }
}
