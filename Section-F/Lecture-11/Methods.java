import javax.swing.SpringLayout;

public class Methods {
    public static int sumus(int a, int b )
    {
int sum = 0 ;
sum = a+b;
System.out.println(sum);
return sum;
    }
    public static void main(String[] args) {
        int a = 5;
        int b  =7;
        sumus(a,b);
    }
}
