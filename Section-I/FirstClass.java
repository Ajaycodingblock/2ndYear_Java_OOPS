public class FirstClass {
   public static void main(String[] args) {
    
int a = 123; //1+2+3+4+5
int b = a;
int c =0;
int even =0;
int sum = 0;
while(a >0)  //for( int i = a;i>0;i  =i/10)
{ 
    int x  = a%10;
   
  sum = sum*10 + x; // 123  321 
  System.out.println(sum);
    a = a/10;
}
// System.out.println(even);
// //System.out.println(odd);
// System.out.println(sum);


 // 123 
 // 321

   } 
}
