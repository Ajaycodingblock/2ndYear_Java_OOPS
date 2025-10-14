// SingleNumber.java
// Program to find the single number in an array using two approaches:
// 1. Brute Force Approach (O(n²))
// 2. Optimized XOR Approach (O(n))

public class SingleNumber {

    /**
     * Approach 1: Brute Force
     * For each element, count its frequency by comparing with every other element.
     * The element which appears exactly once is returned.
     * Time Complexity: O(n²)
     * 
     * @param nums Input array
     * @return The single number that appears once
     */
    public int singleNumberBruteForce(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int vote = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    vote++;
                }
            }
            if (vote == 1) {
                return nums[i];
            }
        }
        return -1; // If no single number found (problem assumption is one single number)
    }

    /**
     * Approach 2: Optimized XOR Approach
     * XOR all elements. Pairs cancel out and only the unique element remains.
     * Time Complexity: O(n)
     * 
     * @param nums Input array
     * @return The single number that appears once
     */
    public int singleNumberXOR(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        
        // Sample input: all numbers appear twice except 4 which appears once
        int[] nums = {2, 1, 4, 5, 2, 4, 1, 5};

        int resultBruteForce = solution.singleNumberBruteForce(nums);
        int resultXOR = solution.singleNumberXOR(nums);

        System.out.println("Single Number (Brute Force): " + resultBruteForce);
        System.out.println("Single Number (XOR): " + resultXOR);
    }
}
