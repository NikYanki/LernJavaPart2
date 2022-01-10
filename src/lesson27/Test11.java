package lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class Test11 {
    FileInputStream fis1, fis2;
    public void abc(){
        try{
            fis1 = new FileInputStream("text9.txt");//файл не найден и внутренний трай блок программа не входит
            try {
                fis2 = new FileInputStream("text10.txt");
            }catch (FileNotFoundException e){
                System.out.println("файл тест 10 не найден");
            }
            }catch (FileNotFoundException e){
            System.out.println("файл тест 9 не найден");// срабатывает этот катч
        }finally {
            System.out.println("это внешний финали блок");
            try {
                fis2.close();
                fis1.close();
            }catch (IOException e) {//здесь ловится не то исключение
                System.out.println("найдено исключение в блок финали");
            }catch (NullPointerException e){
                System.out.println(" этот блок отработает");// ловить исключения класса RunTime считается глупой практикой
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
