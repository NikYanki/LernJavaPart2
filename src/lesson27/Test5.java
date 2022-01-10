package lesson27;

public class Test5 {
    static void abc() {
        System.out.println("работает метод abc");
    abc();  //StackOverflowError  бесконечное выполнение метода

}
    public static void main(String[] args) {
       try {
           abc();
       }
       catch (StackOverflowError e){
           System.out.println("ошибка перехачена");
       }
    }
}
