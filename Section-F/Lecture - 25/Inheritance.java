class Parentcar{
String model = "Samle model";
String name  = "Samplecar";
    
}
class Fortuner extends Parentcar{

}
public class Inheritance {
    public static void main(String[] args) {
        Fortuner f1 = new Fortuner();
        f1.name = "Alto";
        System.out.println(f1.name);
        
    }
}
