package lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}
class Animal{
    int a = 5;
    static int b = 10;
    void abc(){System.out.println("нон статик мтод с класса Animal");}
    static void def(){System.out.println("статик метод из класса Animal");}
}
class Tiger extends Animal{
    int a  = 15;
    static int b = 20;
    void abc(){System.out.println("нон статик мтод с класса Tiger");}
    static void def(){System.out.println("статик метод из классаTiger");}
}