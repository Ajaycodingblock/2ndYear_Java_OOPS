class Vehicle
{
    int seat ;
    String color;
    String name;
    String model;

    public void prt()
    {
        System.out.println(seat);
        System.out.println(color);
        System.out.println(name);
        System.out.println(model);
    }
}


public class ClassObjectInto {
    public static void main(String[] args) {
     Vehicle v1 = new Vehicle();
     v1.prt();
     v1.name = "Alto";
     v1.color = "Black";
     v1.model = "G-Class";
     v1.seat = 2;
     v1.prt();
     Vehicle v2 = new Vehicle();
     Vehicle v3 =  new Vehicle();
  
     //System.out.println(v1.model);

        
    }
    
}
