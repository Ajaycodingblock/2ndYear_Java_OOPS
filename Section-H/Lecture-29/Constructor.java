class Vote
{
int age ;
String origin;

public Vote()
{
    age =  18;
    origin = "Indian";
}
public Vote (int a, String state )
{
    age =  a;
    origin = state;
}
}

public class Constructor {
    public static void main(String[] args) {
        Vote c1 = new Vote();
       System.out.println(c1.age);
       System.out.println(c1.origin);
        Vote c2 = new Vote(34,"Brazil");
       
       System.out.println(c2.age);
       System.out.println(c2.origin);

        
    }
}
