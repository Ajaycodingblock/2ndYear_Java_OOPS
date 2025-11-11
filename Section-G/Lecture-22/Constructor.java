class Final{
    int age;
    String origin;

    public Final()
    {
        age = 18;
        origin = "Indian";
    }
    public Final(int age)
    {
     this.age =  age ;
    
    }

}

public class Constructor {
    public static void main(String[] args) {
  System.out.println("Non Parametrized : - ");      
Final f1 = new Final();
System.out.println(f1.age);
System.out.println(f1.origin);
System.out.println("Prametrazied Construtor : - ");
Final f2  = new Final(23);
System.out.println(f2.origin);
System.out.println(f2.age);

        
    }
}
