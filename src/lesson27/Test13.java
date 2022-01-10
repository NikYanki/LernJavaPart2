package lesson27;

public class Test13 {
    static String abc(){
        String s1 = "";
        String s2 = null;
        try {
            try {
                s1+="1";
                s2.charAt(3);// здесь выбрасывается исключение
                s1+="2";
            }catch (NullPointerException e){//срабатывает данный блок катч
                s1+="3";
                throw new RuntimeException();//данное исключение не ловится
            }finally {
                s1+="4";//финали блок выполняется всегда
                throw new Exception();//выбрасывается исключение
            }
        }catch (Exception e){//данным блоком катч ловится исключение
            s1+="5";
        }
        return s1; //на атпуте мы получим 1345
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
