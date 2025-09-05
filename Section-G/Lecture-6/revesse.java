public class revesse {
    
public static void rotate(int []arr1 )

{
    for(int i = arr1.length-1;i>=0;i--)
    {
System.out.println(arr1[i]);
    }

}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotate(arr); // no return only print
    }
    
}
