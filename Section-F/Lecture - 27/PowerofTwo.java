public class PowerofTwo {
    public static void main(String[] args) {
        int n = 16;
        if(n<=0)
        {
            System.out.println("False");
        }
        if(n==1)
        {
            System.out.println("True");
        }
    while(n>1)
    {
        int a=n%2;
        System.out.println("Value of A: - " + a);
        if(a==1)
        {
            System.out.println("False");
        }
        System.out.println("Value of n :-  " + n);
        n /=2;
    } 
    System.out.println("True");  
    }
}
