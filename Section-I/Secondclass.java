public class Secondclass {

    public static void main(String[] args) {

// print values 
// sum 
// even odd coount 
int sum  =0;
int even =0;
 int arr[] =  {1,3,4,2,5,6};
 int n  = arr.length;

 for(int i = 0;i<n;i++)
 {
    System.out.println(arr[i]);
    sum  = sum + arr[i];
    if(arr[i]%2 == 0)

    {
        even++;
    }
 }
 System.out.println(sum);
 System.out.println(even);



























//         int  a  = 123242;
//         // ouput =  545351
//         int sum  =0 ;
//         while(a >0) 
// { 
//     int x  = a%10;
//    if (x == 2)
//    {
//     sum  = sum *10 + 5;
//    }
//    else{
//   sum = sum*10 + x; 
//    }
//   System.out.println(sum);
//     a = a/10;
// }
// System.out.println(sum);






    }
}