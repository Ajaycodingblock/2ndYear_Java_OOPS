class Vote
{
    int age ;
    String origin;
    public Vote()
    {
        age = 18;
        origin = "Indian";
    }
    public Vote(int age , String origin)
    {
        this.age =  age;
        this.origin = origin;
    }

}
public class Constructor {
    public static void main(String[] args) {
        System.out.println("Non Paramaetrized Call : - ");
        Vote c1 =new Vote();
        c1.age = 45;
        System.out.println(c1.age);
        System.out.println(c1.origin);

        System.out.println("parametrized Call : - ");
        Vote v2  =  new Vote(23,"Brazilian");
        System.out.println(v2.age);
        System.out.println(v2.origin);
        
    }
}
