public class MaxProductInt3536 {

    // ---------------- BRUTE FORCE APPROACH ----------------
    /*
     * Approach:
     * 1. Extract all digits from the integer 'n' and store them.
     * 2. Compute the product of every possible pair of digits.
     * 3. Keep track of the maximum product encountered.
     *
     * Time Complexity: O(k^2), where k = number of digits in n
     * Space Complexity: O(k), for storing digits
     */
    class BruteForce {
        public int maxProduct(int n) {
            // Step 1: Extract digits
            int[] digits = new int[10]; // At most 10 digits for int (0-9)
            int count = 0;

            while (n > 0) {
                digits[count++] = n % 10; // Store last digit
                n /= 10; // Remove last digit
            }

            // Step 2: Try all pairs of digits
            int maxProduct = 0;
            for (int i = 0; i < count; i++) {
                for (int j = i; j < count; j++) { // j starts from i to allow using same digit twice
                    int product = digits[i] * digits[j];
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                }
            }
            return maxProduct;
        }
    }

    // ---------------- OPTIMIZED APPROACH ----------------
    /*
     * Approach:
     * 1. We only need the two largest digits in n to get the maximum product.
     * 2. Traverse each digit:
     *      - Keep track of the largest (max1) and second largest (max2) digits.
     * 3. Return max1 * max2.
     *
     * Time Complexity: O(k), where k = number of digits
     * Space Complexity: O(1)
     */
    class Optimized {
        public int maxProduct(int n) {
            int max1 = 0; // largest digit
            int max2 = 0; // second largest digit

            while (n > 0) {
                int digit = n % 10; // Extract last digit

                if (digit > max1) {
                    max2 = max1; // Update second largest
                    max1 = digit; // Update largest
                } else if (digit > max2) {
                    max2 = digit; // Update only second largest
                }

                n /= 10; // Remove last digit
            }

            return max1 * max2;
        }
    }

    // ---------------- TESTING ----------------
    public static void main(String[] args) {
        MaxProductInt3536 outer = new MaxProductInt3536();

        BruteForce brute = outer.new BruteForce();
        Optimized opt = outer.new Optimized();

        int n = 3536;

        System.out.println("Input: " + n);
        System.out.println("Brute Force Result: " + brute.maxProduct(n));
        System.out.println("Optimized Result: " + opt.maxProduct(n));
    }
}
