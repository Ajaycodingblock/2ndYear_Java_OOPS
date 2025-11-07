class Animal{
    String type ;
    String color;
    int leg;
    public void prt ()
    {
        System.out.println(type);
        System.out.println(color);
        System.out.println(leg);
    }
}
class Dog extends Animal{
    String breed;
    String name;
public void bark()
    {
        System.out.println("Dog is Braking :: ");
    }
}
public class TestOops {
    public static void main(String[] args) {
     Dog d1 =  new Dog();
     //d1.prt();
     d1.bark();   
     d1.name =  "Bob";
     d1.leg = 2;
     System.out.println(d1.leg);

    }
}
