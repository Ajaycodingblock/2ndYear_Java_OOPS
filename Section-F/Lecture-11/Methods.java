public class Methods {

public static int addme(int a )
{
System.out.println("First Line");
return  56;

//System.out.println("After return  Line");

}
public static int addme(int a,int b )
{
System.out.println("First Line");
return 67 ;
}

    public static void main(String[] args) {
       int  a = 3;
       int b = 5;
    System.out.println(addme(a) );  // 67

     // System.out.println(c);

    System.out.println("This is Second Line");
       }
}