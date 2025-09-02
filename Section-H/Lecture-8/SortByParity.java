// Program 14: Sort array by parity (even numbers first)
public class SortByParity {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int index = 0;
        int n  = arr.length;    
        // Place even numbers in front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

        System.out.print("Array sorted by parity: ");
        for (int i = 0 ;i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
