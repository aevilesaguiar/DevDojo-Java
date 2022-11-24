package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.*;
import java.time.temporal.*;


public class TemporalAdjustersTest {
    //TemporalAdjusters é uma interface, ela só tem um método
    //é uma classe utilitária, essa classe foi feita para fazer ajustes no tempo
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        //trocando apenas o dia do mês
        now=now.withDayOfMonth(1);
        System.out.println(now);

        LocalDate now1 = LocalDate.now();
        System.out.println(now1.getDayOfWeek());
        System.out.println(now1.withDayOfYear(15));
        now1=now1.with(ChronoField.DAY_OF_WEEK,1);
        System.out.println(now1);

        // get TemporalAdjuster with the
        // previous day of week adjuster
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.previous(DayOfWeek.THURSDAY);

        // using adjuster for local date time
        LocalDate localDate = LocalDate.of(2029, 12, 11);
        LocalDate previousDOW = localDate.with(temporalAdjuster);

        // print
        System.out.println(
                "previous day of the week "
                        + "having THURSDAY for localdate "
                        + localDate + " is: "
                        + previousDOW);



    }
}
