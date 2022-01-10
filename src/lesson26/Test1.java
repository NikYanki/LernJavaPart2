package lesson26;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        // как известно в ArrayList-е не могут использоваться приметивы
     ArrayList<Integer> list1 = new ArrayList<>();
     list1.add(4);
     list1.add(1);// два данных примера показуют autoboxing
        int a = list1.get(0);
        int b  = list1.get(1);// два данных примера демонстрируют unboxing
    }
}
