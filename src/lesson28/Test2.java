package lesson28;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test2 {
    static void smenaDejurnogo(LocalDate nachalo,LocalDate konec){
        LocalDate date=nachalo;
        while (date.isBefore(konec)){
            System.out.println("наступила дата :"+date+"Пора менять дежурного");
            date=date.plusWeeks(1);
        }
    }
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p){
        LocalDate date=nachalo;
        while (date.isBefore(konec)){
            System.out.println("наступила дата :"+date+"Пора менять дежурного");
            date=date.plus(p);
        }
    }
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2022, Month.SEPTEMBER,1);
        LocalDate konec = LocalDate.of(2023, Month.MAY,31);
        Period period = Period.ofWeeks(1);
        smenaDejurnogo(nachalo, konec, period);
    }
}
