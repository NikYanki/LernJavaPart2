package lesson27;

public class Test15 {
    void marafon(int temperaturavozduha, int tempbega) throws PodvernutNoguExeption, SveloMishcuException{
        if(tempbega>12){
            throw new PodvernutNoguExeption("темп бега был слишком велик"+tempbega);
        }
        if (temperaturavozduha>32){
            throw new SveloMishcuException();
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(30, 11);
        }catch (PodvernutNoguExeption e){
            System.out.println(e.getMessage());
        }catch (SveloMishcuException e){
            System.out.println("слишком жарко");
        }finally {
            System.out.println("Влюбом случае вы получите грамоту");
        }
    }

}
class PodvernutNoguExeption extends Exception{
    PodvernutNoguExeption(String message){
        super(message);
    }
    PodvernutNoguExeption(){}
}
class SveloMishcuException extends Exception{
    SveloMishcuException(String massage){
        super(massage);
    }
    SveloMishcuException(){}
}