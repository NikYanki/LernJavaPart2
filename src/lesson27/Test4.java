package lesson27;
import java.io.*;
public class Test4 {
    public static void main(String[] args){
        File f = new File("text9.txt");
    try {
        FileInputStream fis = new FileInputStream(f);
    System.out.println("Всем хорошео дня");
    }
    catch (FileNotFoundException e){
        System.out.println("сработал блок catch");
    }
    catch (NullPointerException exception){
        System.out.println("не та ловушка");
    }
    finally {
        System.out.println("етот код будет срабатывать всегда");
    }
    System.out.println("это уже метод main");
    }
}
