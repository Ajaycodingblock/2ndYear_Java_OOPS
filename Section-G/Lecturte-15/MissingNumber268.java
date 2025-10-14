// MissingNumber.java
// Program to find the missing number in an array using
// 1. Sorting approach
// 2. Optimized sum formula approach

import java.util.Arrays;

public class MissingNumber268 {

    /**
     * Approach 1: Sorting approach
     * Sort the array and find the first index i such that nums[i] != i.
     * Time Complexity: O(n log n) because of sorting.
     */
    public int missingNumberSorting(int[] nums) {
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i; // Missing number found
            }
        }
        return n; // Missing number is n if all indices matched
    }

    /**
     * Approach 2: Optimized sum formula approach
     * Expected sum of numbers from 0 to n: n*(n+1)/2
     * Subtract the actual sum of array elements to get missing number.
     * Time Complexity: O(n)
     */
    public int missingNumberSum(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber268 solution = new MissingNumber268();

        // Sample input array with numbers from 0 to 4 missing number 2
        int[] nums = {3, 0, 1, 4};

        int missingSorting = solution.missingNumberSorting(nums);
        int missingSum = solution.missingNumberSum(nums);

        System.out.println("Missing Number (Sorting): " + missingSorting);
        System.out.println("Missing Number (Sum Formula): " + missingSum);
    }
}
