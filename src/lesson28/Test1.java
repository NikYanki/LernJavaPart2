package lesson28;

public class Test1 {
    public static void main(String[] args) {
        Car c  = Car.createCar();
    }
}
class Car{
    private Car(){}
    public static Car createCar(){return new Car();}
}