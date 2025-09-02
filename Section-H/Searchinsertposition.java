public class Searchinsertposition {
     public static void main(String[] args) 
{
           int arr [] =  {1,3,5,6,7,8};
int target =  9;
           for(int i =0;i<arr.length;i++)
           {
               if(arr[i]>=target)
               {
                    System.out.print(i);
                    break;
               }
               
               else 
               {
                    System.out.println(arr.length);
               }
           }

     }
    
}
