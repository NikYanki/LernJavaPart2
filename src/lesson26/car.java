package lesson26;
import java.util.ArrayList;
public class car {
    String color;
    String  engine;
    car(String color, String engine){
        this.color=color;
        this.engine=engine;
    }
    public boolean equals(Object obj){   //данний метод иквалс перезаписан так чтобы сравнивать объекты не только
        if (obj instanceof car){         //класса кар но и объекты которые имеют  is-a взаимосвязь
            car c2 =(car)obj;
            return color.equals(c2.color)&& engine.equals(c2.engine);
        }else {return false;
        }

    }
}
class test{
    public static void main(String[] args) {
        car cr1 = new car("red","v6");
        car cr2 = new car("red","v6");
        car cr3 = new car("white","r6");
        System.out.println(cr1.equals(cr2));
        ArrayList<car> list1 =new ArrayList<>();
        list1.add(cr1);
        list1.add(cr2);
        list1.add(cr3);
        car cr4 = new car("white","r6");
        System.out.println(list1.contains(cr4));
    }
}

