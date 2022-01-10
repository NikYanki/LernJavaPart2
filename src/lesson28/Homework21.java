package lesson28;
import java.time.*;
import java.time.format.*;
public class Homework21 {
    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("YYYY MMMM - dd !! hh:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");
    public void smena(LocalDateTime start, LocalDateTime finish, Duration d, Period p){
        do{
            System.out.print("Работаем с :"+f1.format(start));
            start = start.plus(p);
            System.out.println("  До :"+f1.format(start));
            System.out.print("Отдыхаем с :"+f2.format(start));
            start = start.plus(d);
            System.out.println("  До :"+start.format(f2));
            System.out.println();
        }while (start.isBefore(finish));
    }

    public static void main(String[] args) {
        Homework21 h = new Homework21();
        LocalDateTime ldt1 = LocalDateTime.of(2022, 1, 8, 06, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 9, 10, 12, 00);
        Period p = Period.ofDays(2);
        Duration d = Duration.ofHours(16);
        h.smena(ldt1, ldt2, d, p);
    }
}
