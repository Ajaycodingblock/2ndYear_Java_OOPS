// Program 17: Reverse array using two-pointer method
public class ReverseArrayTwoPointer {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed Array: ");
        for (int i = 0 ; i<n ;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
}
