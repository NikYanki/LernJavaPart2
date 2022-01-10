package lesson29;

public class Test4 {
static void def(Test5 t){
    System.out.println(t.abc("Privet"));
}

    public static void main(String[] args) {
        def(x-> x.length());
    }
}
interface Test5{
    int abc(String s);
}
/*
public class Test4 {
static void def(Test5 t){
    System.out.println(t.abc());
}

    public static void main(String[] args) {
        def(()-> 5);
    }
}
interface Test5{
    int abc();
}
* */