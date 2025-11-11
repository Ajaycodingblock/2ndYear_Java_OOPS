class encap{
    private int n;
    public void setname(int x)
    {
        n = x;
    }
    public int getname()
    {
        return n;
    }
}




public class Encapsulation {
    public static void main(String[] args)
    {
        encap c1 = new encap();
        c1.setname(89);
System.out.print(c1.getname());

    }
}
