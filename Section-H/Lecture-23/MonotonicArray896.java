// Problem: 896. Monotonic Array
// Determine whether a given array is monotonic (entirely non-increasing or non-decreasing).

public class MonotonicArray896 {

    // -------------------- MAIN SOLUTION CLASS --------------------
    class Solution {
        /*
         * Function: isMonotonic
         * ---------------------------------
         * Returns true if the given array is monotonic.
         *
         * A monotonic array is:
         *  -> Non-decreasing if nums[i] <= nums[i+1] for all i
         *  -> Non-increasing if nums[i] >= nums[i+1] for all i
         *
         * Approach:
         * 1. Traverse the array once.
         * 2. Count how many times consecutive pairs are non-decreasing (c1)
         *    and non-increasing (c2).
         * 3. If all consecutive pairs are non-decreasing or all are non-increasing,
         *    then the array is monotonic.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */
        public boolean isMonotonic(int[] nums) {
            int c1 = 0; // Counts non-decreasing pairs
            int c2 = 0; // Counts non-increasing pairs
            int n = nums.length;

            // Compare each pair of adjacent elements
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                    c1++;
                }
                if (nums[i] >= nums[i + 1]) {
                    c2++;
                }
            }

            // If all pairs are either non-decreasing or non-increasing
            if (c1 == n - 1 || c2 == n - 1) {
                return true;
            }
            return false;
        }
    }

    // -------------------- TESTING SECTION --------------------
    public static void main(String[] args) {
        MonotonicArray896 outer = new MonotonicArray896();
        Solution sol = outer.new Solution();

        // Test Case 1: Increasing
        int[] nums1 = {1, 2, 2, 3};
        System.out.println("Input: [1, 2, 2, 3]");
        System.out.println("Is Monotonic? " + sol.isMonotonic(nums1)); // true

        // Test Case 2: Decreasing
        int[] nums2 = {6, 5, 4, 4};
        System.out.println("Input: [6, 5, 4, 4]");
        System.out.println("Is Monotonic? " + sol.isMonotonic(nums2)); // true

        // Test Case 3: Not Monotonic
        int[] nums3 = {1, 3, 2};
        System.out.println("Input: [1, 3, 2]");
        System.out.println("Is Monotonic? " + sol.isMonotonic(nums3)); // false
    }
}
