import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
          list.add(3);
         list.add(4);
        //   list.add(5);
        // list.add(6);
        
System.out.println(list);
list.remove(2);
System.out.println("Print using Loop : - ");
int n = list.size();


for(int i  = 0;i<n;i++)
{
    System.out.println(list.get(i));
}


    }
    
}
