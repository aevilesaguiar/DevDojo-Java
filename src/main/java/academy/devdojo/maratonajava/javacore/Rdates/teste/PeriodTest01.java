package academy.devdojo.maratonajava.javacore.Rdates.teste;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.*;
import java.time.temporal.ChronoUnit;


//Period é baseado na data, quando queremos um periodo de datas

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period period= Period.between(now,nowAfterTwoYears);
        System.out.println(period);
        Period period1 = Period.ofDays(10);
        System.out.println("Dias: "+period1);
        Period period2 = Period.ofWeeks(58);
        System.out.println("Semanas: "+period2);
        Period period3 = Period.ofMonths(3);
        System.out.println("Meses: "+period3);
        Period period4 = Period.ofYears(3);
        System.out.println("Anos: "+period4);


        //Period não conseguimos pegar por exemplo a quantidade de dias em meses.
        //para fazer isso precisamos usar a Classe ChronoUnit

        System.out.println(Period.between(now,now.plusDays(period3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(period3.getDays()),ChronoUnit.DAYS));




    }
}
