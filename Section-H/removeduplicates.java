public class removeduplicates {
    public static void main(String[] args) {
        int arr[] =  {1,2,3,4,3,5,3,6};
        int val = 3;
        int k  =0;

        for(int i = 0 ;i<arr.length;i++)
        {if (arr[i]!=val)
            {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp; 
                k++;
            }

        }
    }
    
}
