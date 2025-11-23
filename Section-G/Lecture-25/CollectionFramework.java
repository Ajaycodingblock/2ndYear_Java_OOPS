import java.util.*;


public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList <Integer>  list = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);

        list.add(45);
        list.add(46);
        list.add(47);
        list.add(48);

        System.out.println(list);
        int n  = 5;


        for(int i = 0;i<n;i++)
        {
             int x = sc.nextInt();
             list.add(x);
        }
        System.out.println("Print using loop  : - ");
int len = list.size();
        for(int i = 0 ;i<len;i++)
       {
        System.out.println(list.get(i));
       }
        
    }
    
}
