 class Car
{
String model = "Audi";
int price = 12000;
public void printFeatures()
{
    System.out.println(model);
    System.out.println(price);
}
}
public class ClassObject {
    public static void main(String[] args) {
       Car obj = new Car();
       obj.printFeatures(); 
       obj.model =  "Mercedez";
       obj.printFeatures(); 
       Car obj2 = new Car();
       obj2.printFeatures();
       
}
}