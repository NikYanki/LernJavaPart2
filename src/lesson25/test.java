package lesson25;

public class test {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Techer();//данный пример тоже является кастинком(мы создаём работника и говорим чуствуй себя как учитель)
        Employee emp3 = new Driver();//upcasting
        Helpable h = new Doctor();
        Employee[] ar1 = {new Driver(), new Techer(), new Doctor()};
        Employee [] array = new Employee[]{emp1, emp2, emp3};
        //for (Employee emp : array){
          // emp.work();
        //}
        System.out.println(emp1 instanceof Employee);// true
        System.out.println(emp1 instanceof Techer);// false
        //System.out.println(emp1 instanceof test); будет ошибка компиляции так как никакой связи нет.
        String s ="hi";
        s = null;
        System.out.println(s instanceof String);//false
        System.out.println(array instanceof Object);//true
        ((Doctor)emp1).treat();//так виглядит кастинг мы убеждаем компилятор что emp1 есть Doctor  Downcasting
        ((Doctor)h).treat();// так же само все работает из объектами типа интерфейс  Downcasting
    }

}
abstract class Employee{
   abstract void eat();
   abstract void sleep();
   abstract void work();
}
interface Helpable{
    void StopBlood();
    default void ExtinguishTheFire(){
        System.out.println("Тушить пожар");
    }
}
interface FirstAidKit{
    void FirstAid();
}
class Doctor extends Employee implements Helpable, FirstAidKit{
    void eat(){
        System.out.println("Доктор кушает");
    }
    void sleep(){
        System.out.println("Доктор спит");
    }
    void work(){
        System.out.println("Доктор работает");
    }
    public void StopBlood(){
        System.out.println("Доктор умеет останавливать кровотечение");
    }
    public void FirstAid(){
        System.out.println("Доктор умеет давать первую неотложную помощь");
    }
    void treat(){
        System.out.println("Доктор лечит");
    }
}
class Techer extends Employee implements FirstAidKit{
    void eat(){
        System.out.println("Учитель кушает");
    }
    void sleep(){
        System.out.println("Учитель спит");
    }
    void work(){
        System.out.println("Учитель работает");
    }
    public void FirstAid(){
        System.out.println("Учитель умеет давать первую неотложную помощь");
    }
    void study() {
        System.out.println("Учитель учит");
    }
}
class Driver extends Employee implements Helpable, FirstAidKit{
    void eat(){
        System.out.println("Водитель кушает");
    }
    void sleep(){
        System.out.println("Водитель спит");
    }
    void work(){
        System.out.println("Водитель работает");
    }
    public void StopBlood(){
        System.out.println("Водитель умеет останавливать кровотечение");
    }
    public void FirstAid(){
        System.out.println("Водитель умеет давать первую неотложную помощь");
    }
    void drive(){
        System.out.println("Водитель водит автомобиль");
    }
    public void ExtinguishTheFire() {
        System.out.println("Водитель умеет тушить пожар");
    }
}
