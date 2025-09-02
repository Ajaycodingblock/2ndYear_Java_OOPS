// Program 8: Find maximum and minimum in an array
public class MaxMinArray {
    public static void main(String[] args) {
        int arr[] = {12, 4, 56, 7, 89, 1};
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
            { 
            max = arr[i];
            }

            if (arr[i] < min) 
            {
            min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
