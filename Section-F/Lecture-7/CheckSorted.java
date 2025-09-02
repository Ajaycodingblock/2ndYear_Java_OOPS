// Program 16: Check if array is sorted in ascending order
public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 5};
        boolean sorted = true;

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
