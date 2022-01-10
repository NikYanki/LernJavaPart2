package lesson27;
import java.io.*;
public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("text9.txt");
            System.out.println("объект файл создан");
            FileInputStream fis = new FileInputStream(f);//всё файл не найден блок try закончил свою работу
            System.out.println("стрим был создан");
            int counter =0;
            while (true){
                counter++;
                result.append(fis.read());
                System.out.println("информацыя читается");
                if (counter==3){
                    fis.close();
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("1");// продолжил работу
        }
        catch (IOException e){
            System.out.println(2);
        }
        finally {
            System.out.println("это бок finally");// срабатывает вседа
        }
    }
}
