package lesson27;

public class homewrk27 {
    public static void main(String[] args)throws Exception {
        Tiger1 t = new Tiger1();
        t.eat("myaso");
        t.drink("voda");
try {
    t.drink("voda");
    try {
        t.drink("pivo");
    }catch (NeVodaException e){
        System.out.println(e);
    }catch (Exception e){
        System.out.println(e);
    }finally {
        System.out.println("Eto inner finally block");
    }
}catch (RuntimeException e){
    System.out.println(e);
}catch (Exception e){
    System.out.println(e);
}
    }
}

/*  В классе Lesson27 внутри метода main создайте объект класса Tiger. Вызовите метод eat с параметром “myaso”
                . Затем в блоке try вызовите метод drink с параметром voda. В данном блоке try создайте ещё один блок
                try, где вызовите метод drink с параметром pivo. Во внешнем блоке try пусть также размещаются блок
                catch, который ловит исключения типа Exception и в своем теле выводит на экран мессаж данного
                исключения; блок catch, который ловит исключения типа NeVodaException и в своем теле выводит на
                экран мессаж данного исключения; блок finally, который в своем теле выводит на экран
                "Eto inner finally block“. К внешнему try блоку пусть относятся блок catch, который ловит исключения " +
                "типа Exception и в своем теле выводит на экран мессаж данного исключения; блок catch, который ловит " +
                "исключения типа RuntimeException и в своем теле выводит на экран мессаж данного исключения. */
class NeMyasoException extends RuntimeException{
    NeMyasoException(String message){
        super(message);
    }
    NeMyasoException(){}
}
class NeVodaException extends Exception{
    NeVodaException(String message){
        super(message);
    }
    NeVodaException(){}
}
class Tiger1{
    public void eat(String eda) throws NeMyasoException{
        if (eda.equals("myaso")){
            System.out.println("Tiger est myaso");
        }else {
        throw new NeMyasoException("Tiger ne est "+eda);}
    }
    public void drink(String napitok) throws NeVodaException {
        if (napitok.equals("voda")){
            System.out.println("Tiger pyet vodu");
        }else {
        throw new NeVodaException("Tigr ne pyet " +napitok);}
    }

}
