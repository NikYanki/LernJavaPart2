package lesson25homework;

public class test {
    public static void main(String[] args) {
    Animal a1 = new Lev("");
    Animal a2 = new Pingvin("");
    Animal a3 = new Mechenosec("");
    Fish f1 = new Mechenosec("");
    Mechenosec f2 = new Mechenosec("");
    Bird b1 = new Pingvin("");
    Pingvin b2 = new Pingvin("");
    Mammal m1 = new Lev("");
    Lev m2 = new Lev("");

    Speakable s1 = new Pingvin("");
    Speakable s2 = new Lev("");

    Animal[] array1 = {a1, a2, a3, f1, f2, b1, b2, m1, m2};
    Speakable[] array2 = {s1, s2, m1, m2, b1, b2};
    for(Animal a: array1) {
        if (a instanceof Lev) {
            ((Lev) a).eat();
            ((Lev) a).run();
            ((Lev) a).sleep();
            ((Lev) a).speak();
            System.out.println(((Lev) a).name);
        } else if (a instanceof Mechenosec) {
            Mechenosec m = (Mechenosec) a;
            m.eat();
            m.swim();
            m.sleep();
            System.out.println(m.name);
        } else if (a instanceof Pingvin) {
            Pingvin p = (Pingvin) a;
            p.eat();
            p.fly();
            p.sleep();
            p.speak();
            System.out.println(p.name);
        }
    }
        System.out.println("________________________________________________________");
    for (Speakable s : array2){
        if(s instanceof Lev){
            Lev l =(Lev) s;
            ((Lev) s).eat();
            l.run();
            l.speak();
            l.speak();
            System.out.println(l.name);

        }else if (s instanceof Mechenosec){
            Mechenosec m = (Mechenosec)s;
            m.eat();
            m.swim();
            m.sleep();
            System.out.println(m.name);
        }
        else if( s instanceof Pingvin){
            Pingvin p = (Pingvin) s;
            p.eat();
            p.fly();
            p.sleep();
            p.speak();
            System.out.println(p.name);
        }
    }
        }
    }
abstract class Animal{
    protected String name;

    Animal(String name){
        this.name=name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name+"поют");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Некоторые говорят");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name=name;
    }
    void swim(){
        System.out.println("Меченосец красивая рыбка которая быстро плавает!");
    }
    void eat(){
        System.out.println("Меченосец нк хищная рыба и ест обычный рыбий корм");
    }
}
class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Пингвин любит есть рыбу");
    }
    void sleep(){
        System.out.println("Пингвины спят прижавшись друг к другу");
    }
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }
    public void speak(){
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Лев как любой хищник любит мясо");
    }
    void sleep(){
        System.out.println("Большую часть дня лев спит!");
    }
    void run(){
        System.out.println("Лев это не самая быстрая кошка!");
    }
}
