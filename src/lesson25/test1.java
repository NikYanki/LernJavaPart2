package lesson25;

public class test1 {
    public static void main(String[] args) {
        car c = new car();
        System.out.println(c.a);
        c= null;
        System.out.println(c.a);
    }
}
class car{
    static int a = 4;//пока переменная а статик то она никак не связана с объектом
}
