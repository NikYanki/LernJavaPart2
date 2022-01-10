package lesson27;
import java.io.*;
public class Test9 {
    void abc() throws FileNotFoundException{
        try {
            File f = new File("text9.txt");
            FileInputStream fis = new FileInputStream(f);
        }catch (FileNotFoundException e){
            System.out.println("исключение поймано и немного обработано");
            throw e;//c помощью keywod throw можно выкидывать исключения
        }finally {
            System.out.println("это блок финали");
        }
    }
    void metod(){
        try {
            abc();
        }
        catch (FileNotFoundException e){
            System.out.println("catched");
        }
    }
    void def(){
        try{
            int[] array = {1, 1, 4,};
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("исключение поймано и немного обработано");
            throw e; //c помощью keywod throw можно выкидывать исключения
        }finally {
            System.out.println("это блок финали");
        }
    }
}
class Test9_1{
    public static void main(String[] args) throws FileNotFoundException {//в данном случае обязательно нужно подписать
        //чо в методе мейн используются методы выбрасывающие исключения
        Test9 t = new Test9();
       // t.abc(); //в методе мейн может сработать только один метод так как оба метода выбрасывают исключение
        //t.def();
        t.metod();
    }
}
