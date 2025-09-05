public class factorial {

public static int facto(int val)
{
    int n = 1;
    for(int i= 1;i<=val;i++)
    {
        n = n*i;  
        
    }
    return n;
    
}
     public static void main(String[] args) 
     {
        int n = 5;
     int k =  facto(n); 
     }
}
