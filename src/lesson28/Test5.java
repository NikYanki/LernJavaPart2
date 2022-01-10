package lesson28;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1995, Month.MAY, 23, 18, 40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
        System.out.println(f.format(ldt));
    }
}
