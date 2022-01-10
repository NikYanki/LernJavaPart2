package lesson28;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1995, Month.MAY, 23, 18, 40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy hh mm");
        LocalDate ld = LocalDate.of(2022, Month.JANUARY, 4 );
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd YYYY ww");
        System.out.println(ld.format(f2));
       // LocalDate ld2 = LocalDate.parse("23 1995 05",f2);
        //System.out.println(ld2);
    }
}
