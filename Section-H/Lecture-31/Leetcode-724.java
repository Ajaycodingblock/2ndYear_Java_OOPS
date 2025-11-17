// File Name: Leetcode_724.java

// Leetcode 724: Find Pivot Index
// Pivot Index is the index where sum of left side == sum of right side

public class Leetcode-724 {

    public static int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Step 1: Calculate total sum
        for (int x : nums) {
            totalSum += x;
        }

        int leftSum = 0;

        // Step 2: Check pivot condition for every index
        for (int i = 0; i < nums.length; i++) {

            // Right Sum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;  // Pivot index found
            }

            leftSum += nums[i];  // Update left sum
        }

        return -1; // No pivot found
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));  // Output: 3
    }
}
