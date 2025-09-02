// Program 10: Find Second Largest element in an array
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10, 20, 4, 45, 99, 99};
        int first = 0;
        int second = 0;
        int n =  arr.length;
        if (arr[0]>arr[1])
        {
            first = arr[0];
            second =  arr[1];
        }
        else 
        {
          first = arr[1];
          second =  arr[0];  
        }

        // Find first and second largest
        for (int i =0; i< n ; i++) {

            if (arr[i] > first) 
            {
                second = first;
                first = arr[i];
            } 
            else if (arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
