// Program 18: Rotate Array by k steps (right rotation)
public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;
        k = k % n; // in case k > n

        // Reverse whole array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining
        reverse(arr, k, n - 1);

        System.out.print("Array after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Helper method to reverse portion of array
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
