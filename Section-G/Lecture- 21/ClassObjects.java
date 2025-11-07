class Toyota
{
    String name ;
    String color;
    int seat;
    int price;

    public void prt()
    {
        System.out.println(name);
        System.out.println(color);
        System.out.println(seat);
        System.out.println(price);
    }

}

public class ClassObjects {
    public static void main(String[] args) {
        Toyota f1 = new Toyota();
        f1.prt();
        f1.name = "Fortuner";
        f1.color = "Black";
        f1.seat = 7;
        f1.prt();
        Toyota f2 =  new Toyota();
        f2.prt();
        f2.name =  "Clamby";
        f2.price=4500000;
        System.out.println(f1.seat);
        
    }
}
