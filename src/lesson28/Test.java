package lesson28;
import java.time.*;
public class Test {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2019,Month.MAY,23);
        LocalDateTime ldt1 = LocalDateTime.of(1995, Month.MAY,23, 14, 37, 59, 358359204);
        LocalTime lt1 = LocalTime.of(13,48);
        LocalDateTime ldt2 = LocalDateTime.of(ld1,lt1);
        System.out.println(ldt2);
        LocalTime lt2= lt1.plusHours(1).minusMinutes(11).plusSeconds(24).minusNanos(12);
        System.out.println(lt2);
        LocalDate ld2 = ld1.minusYears(95).plusMonths(5).minusWeeks(4).plusDays(23);
        System.out.println(ld2);
        System.out.println(ld1.isBefore(ld2));//лд1 был до лд2
        System.out.println(ld1.isAfter(ld2));//лд1 был после лд2
    }
}
