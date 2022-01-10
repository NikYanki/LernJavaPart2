package lesson27;
import java.io.*;
public class Test8 {
   /* static int abc(){
        try {
            File f = new File("text9.txt");
            FileInputStream fis = new FileInputStream(f); // здесь блок закончил свою роботу получив исключение
            return 5;
        }
        catch (FileNotFoundException e){ // данный блок пехватил исключение и вернул значение равное 6.
        System.out.println("исключение поймано");
        return 6;
    }
    finally{
            System.out.println("это блок финали");
        }

    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}*/
    //ВТОРОЙ ПРИМЕР АНАЛОГИЧНОЙ ПРОГРАММЫ

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("привет");
        try {
            File f = new File("text9.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("исключение поймано");
            System.out.println("переменная а в блоке катч =:"+a);
            return a;
        }
        finally {
            a.append("!!!");
            System.out.println("это финали блок");
            System.out.println("переменная а в блоке финали =:"+a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
   }
