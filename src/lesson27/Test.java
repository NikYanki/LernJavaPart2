package lesson27;

public class Test {
    public static void main(String[] args) {
        int array[] = {2, 4, 5};
        try{
            System.out.println(array[5]);
            System.out.println("получилось");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("поймалась");
        }
        finally {
            System.out.println("Этот блок выполняется всегда");
        }
        System.out.println("Это уже продолжение метода main");
    }
}
