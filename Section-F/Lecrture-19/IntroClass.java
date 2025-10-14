
 class College
{
String name ;
String sec;
String roll;
String age;
}
public class IntroClass {
     public static void main(String[] args) {
       College  mayank =  new  College();
       mayank.name = "Aarav";
       mayank.roll = "1";
       mayank.sec = "F";
       mayank.age = "18";

       College obj2 =  new College();
       obj2.name = "Vijay Khanan";
       System.out.println(mayank.name);
    }
}