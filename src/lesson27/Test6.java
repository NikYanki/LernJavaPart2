package lesson27;
import java.io.*;
public class Test6 {
    public static void main(String[] args) {
        try {
          File f = new File("text9.txt");
          FileInputStream fis = new FileInputStream(f);
        }
        catch (NullPointerException e){
            System.out.println("1");
        }
        catch (FileNotFoundException e){
            System.out.println("2");
        }
      /*  catch (Throwable e){         так не может быть
            System.out.println("5");
        }*/
        catch (RuntimeException e){
            System.out.println("3");
        }
        catch (Exception e){
            System.out.println("4");
        }
        catch (Throwable e){
            System.out.println("5");
        }
        finally {
            System.out.println("в данном примере программы мы вилим что есть разница размещения блоков cath " +
                    "сначала идут дочирние классы мсключений а потом уже супер классы вплоть до Throwable");
        }
    }
}
