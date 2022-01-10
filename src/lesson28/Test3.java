package lesson28;
import java.time.*;
public class Test3 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022,Month.JANUARY,7,20,30,50,94348);
    System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getYear());
        System.out.println();
        System.out.println(ldt.getNano());
        System.out.println(ldt.getSecond());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getHour());


    }
}
