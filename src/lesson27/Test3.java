package lesson27;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("text9.txt");//FileNotFoundException
        FileInputStream fis = new FileInputStream(f);
    fis.read();
    }
}
