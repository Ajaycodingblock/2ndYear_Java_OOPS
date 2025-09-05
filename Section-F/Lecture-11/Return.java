public class Return {

    public static int addme(int a)
    { System.out.println("line before returnm ");
       
        System.out.println("line");
        return 1;
    }
    public static void main(String[] args) {
        int a = 5;
        addme(a);
    }
}
