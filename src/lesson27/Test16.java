package lesson27;
import java.util.*;
public class Test16 {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<>();
        list.add("1");       IndexOutOfBoundsException
        list.add("2");
        System.out.println(list.get(3));*/
//System.out.println(5/0);  ArithmeticException
   /* Driver d = new Driver();
    Techer t = new Techer();    ClassCastException
    Emploee[] array1 = {d, t};
    Techer t2 = (Techer)array1[0];*/
    //createPwd("wfrwgegggtrggg4ffdw");//IllegalArgumentException
    }
    public static void createPwd(String pwd){
        if (pwd.length()<6){
            throw new IllegalArgumentException("пароль слишком короткий");
        }if (pwd.length()>12){
            throw new IllegalArgumentException("пароль слишком длинный");
        }
        System.out.println("пароль принят");
    }
}
class Emploee{}
class Techer extends Emploee{}
class Driver extends Emploee{}

class Samolet{
    String sostoyanie = "v ojidanii";//v ojidanii, v vozduhe, polet otmenen
    public void letet(){
        sostoyanie= "v vozduhe";
        System.out.println("самолет летит");
    }
    public void ojidat(){
        if (sostoyanie.equals("v vozduhe")){
            throw new IllegalStateException("самолет уже в воздухе");
        }
        sostoyanie ="v ojidanii";
        System.out.println("самолет в ожидании полета");
    }
    public void otmnitPolet(){
        if (sostoyanie.equals("v vozduhe")){
            throw new IllegalStateException("самолет уже в воздухе");
        }
        sostoyanie = "polet otmenen";
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.letet();
        s.otmnitPolet();//IllegalStateException
    }
}