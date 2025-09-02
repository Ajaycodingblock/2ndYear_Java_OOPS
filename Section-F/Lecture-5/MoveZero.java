// Program 12: Move all zeros to the end of the array
public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n =  arr.length;
        int k = 0 ;
        // Place non-zeros in front
        for (int i = 0; i<n ; i++) {
            if (arr[i] != 0) {
               int temp = arr[i];
               arr[i] =  arr[k];
               arr[k] = temp ;
               k++; 
            }
        }

     
        System.out.print("Array after moving zeros: ");
        for (int i =0; i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
