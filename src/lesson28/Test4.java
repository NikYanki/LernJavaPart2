package lesson28;
import java.time.*;
import java.time.format.*;
public class Test4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1995,Month.MAY, 23, 18, 40);
    DateTimeFormatter d  = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    DateTimeFormatter d1 = DateTimeFormatter.ISO_DATE;
    DateTimeFormatter d2  = DateTimeFormatter.ISO_LOCAL_TIME;
   System.out.println(ldt);
    System.out.println(ldt.format(d));
        System.out.println(ldt.format(d1));
        System.out.println(ldt.format(d2));
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
