// Problem: 238. Product of Array Except Self
// Given an integer array nums, return an array answer such that
// answer[i] is equal to the product of all elements of nums except nums[i].

public class ProductOfArray238 {

    // -------------------- BRUTE FORCE APPROACH --------------------
    /*
     * Approach:
     * For each element, multiply all other elements except itself.
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     */
    class BruteForceSolution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];

            for (int i = 0; i < n; i++) {
                int multi = 1;
                for (int j = 0; j < n; j++) {
                    if (j == i) continue; // Skip current element
                    multi *= nums[j];
                }
                res[i] = multi;
            }
            return res;
        }
    }

    // -------------------- OPTIMIZED APPROACH --------------------
    /*
     * Approach:
     * 1. Use two auxiliary arrays - left[] and right[].
     *    - left[i] = product of all elements to the left of i.
     *    - right[i] = product of all elements to the right of i.
     * 2. Multiply left[i] * right[i] to get the result for each index.
     * 
     * Example: nums = [1, 2, 3, 4]
     * left  = [1, 1, 2, 6]
     * right = [24, 12, 4, 1]
     * result= [24, 12, 8, 6]
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    class OptimizedSolution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            int[] left = new int[n];
            int[] right = new int[n];

            // Initialize boundary conditions
            left[0] = 1;
            right[n - 1] = 1;

            // Fill left array (prefix products)
            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * nums[i - 1];
            }

            // Fill right array (suffix products)
            for (int i = n - 2; i >= 0; i--) {
                right[i] = right[i + 1] * nums[i + 1];
            }

            // Multiply left and right for final result
            for (int i = 0; i < n; i++) {
                res[i] = left[i] * right[i];
            }

            return res;
        }
    }

    // -------------------- MAIN METHOD --------------------
    public static void main(String[] args) {
        ProductOfArray238 outer = new ProductOfArray238();
        BruteForceSolution brute = outer.new BruteForceSolution();
        OptimizedSolution optimized = outer.new OptimizedSolution();

        int[] nums = {1, 2, 3, 4};

        System.out.println("Input Array: [1, 2, 3, 4]");

        int[] bruteResult = brute.productExceptSelf(nums);
        System.out.print("Brute Force Result: ");
        for (int val : bruteResult) {
            System.out.print(val + " ");
        }
        System.out.println();

        int[] optResult = optimized.productExceptSelf(nums);
        System.out.print("Optimized Result: ");
        for (int val : optResult) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
