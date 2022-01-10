package lesson25;

public class test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if(j instanceof Human){
            System.out.println("+");
        }
        if (m instanceof Jumpable){
            System.out.println("+");
        }
        //if (s instanceof Human) здесь будет ошибка компиляции так как нет никакой связи нет между s и Human
        if(s instanceof Jumpable){}//здесь нет никакой ошибки так как класс может имплеминтировать итерфейс
    }
}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
interface Jumpable{}
