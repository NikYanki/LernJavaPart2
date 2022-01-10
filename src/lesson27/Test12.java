package lesson27;

public class Test12 {
    void abc(){
        int array[] = {1, 2, 4};
    try {
        System.out.println(array[5]);
    }catch (ArrayIndexOutOfBoundsException e){//данный блк сработал
        String s = null;
        System.out.println(s.length());
    }catch (NullPointerException e){
        System.out.println("Дання ловушка не сработает потому что внутри перваго катча" +
                "нужно дыло поткрыть внутренний блок трай и уже внатренним блоком катч ловить " +
                "данное исключение");
    }
    }
    void def(){
        int array[] = {1, 2, 4};
        try {
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){//данный блк сработал
            String s = null;
           try {
               System.out.println(s.length());
           }catch (NullPointerException e1){
               System.out.println("Дання ловушка сработает потому что она внутри перваго катча");
           }
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        //t.abc();
        t.def();
    }
}
