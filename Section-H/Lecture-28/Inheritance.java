class Animal
{
    int leg;
    int nose;
    String breed;
    String name;
    
    public void PrintVlaue()
    {
        System.out.println(nose);
        System.out.println(name);
    }

}
 class Dog extends Animal
 {

 }
public class Inheritance {
    public static void main(String[] args) {
        Dog d1  =  new Dog();
        d1.PrintVlaue();
    }
}
