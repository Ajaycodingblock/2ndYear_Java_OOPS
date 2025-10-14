// Majority.java
// Program to find the majority element in an array using two approaches:
// 1. Brute Force Approach (O(n²))
// 2. Optimized Boyer-Moore Voting Algorithm (O(n))

public class Majority {

    /**
     * Brute Force Approach to find majority element
     * Time Complexity: O(n²)
     * 
     * For each element, count how many times it appears by
     * comparing it with every other element in the array.
     * If the count is greater than half the array size (n/2),
     * return that element as the majority.
     * If no element found (edge case), return -1.
     * 
     * @param nums Input array of integers
     * @return Majority element or -1 if none exists
     */
    public int majorityElementBruteForce(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int vote = 0; // count occurrences of nums[i]
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    vote++;
                }
            }
            if (vote > n / 2) {
                return nums[i]; // majority element found
            }
        }
        return -1; // no majority element
    }

    /**
     * Optimized Boyer-Moore Voting Algorithm
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * Maintains a candidate element and a vote count.
     * Iterates through array, adjusting vote count:
     * - If vote count is zero, pick a new candidate.
     * - If current element matches candidate, increment vote.
     * - Otherwise, decrement vote.
     * Finally returns the candidate as majority element.
     * 
     * @param nums Input array of integers
     * @return Majority element
     */
    public int majorityElementOptimized(int[] nums) {
        int majority = nums[0]; // initial candidate
        int vote = 1;           // initial vote count
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (vote == 0) {
                majority = nums[i];
                vote = 1;
            } else if (nums[i] == majority) {
                vote++;
            } else {
                vote--;
            }
        }
        return majority;
    }

    /**
     * Main method to demonstrate both approaches
     */
    public static void main(String[] args) {
        Majority solution = new Majority();

        // Sample input array
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // Find majority element using brute force
        int bruteForceResult = solution.majorityElementBruteForce(nums);
        // Find majority element using optimized algorithm
        int optimizedResult = solution.majorityElementOptimized(nums);

        // Output results
        System.out.println("Majority Element (Brute Force): " + bruteForceResult);
        System.out.println("Majority Element (Optimized): " + optimizedResult);
    }
}
