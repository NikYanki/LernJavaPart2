package lesson27;
import java.io.*;
public class Test14 {
    static FileInputStream fis1, fis2;//создались две переменные равны налл

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test10.txt");//выбрасывается исключение
            System.out.println("файл существует в системе и найден");//уже не работает
            try {
                fis2.close();//дело до внутренних блоков не доходит так как выбросилось исключение
            }catch (IOException e){
                System.out.println("проблемы со стримом в фис2");
            }
        }catch (FileNotFoundException e){//сработал этот катч
            System.out.println("Файл тест 9 не найден");
        }catch (NullPointerException e){System.out.println("сработал нал поинтер ексцепшин");}//в данном слчае бесполезная часть кода
    }
}
