public class Factorial {

public static int FactoBhai(int fact)
{
    int n = 1;
    for(int i = 1;i<=fact;i++)
    {
        n = n*i;
    }
    return n;
}

    public static void main(String[] args)
    {
        int n = 5;
       //System.out.println( FactoBhai(n));
       
    }
}
