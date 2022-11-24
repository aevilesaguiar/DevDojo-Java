package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;


//Chronounit :Um conjunto padrão de unidades de períodos de data . Este conjunto de unidades fornece acesso baseado em unidade para manipular uma data, hora ou data-hora

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime aniversário = LocalDateTime.of(1983, Month.AUGUST,14,12,0,59);
        LocalDateTime now = LocalDateTime.now();

        long days = ChronoUnit.DAYS.between(aniversário, now);
        long months = ChronoUnit.MONTHS.between(aniversário, now);
        long years = ChronoUnit.YEARS.between(aniversário, now);
        long minutes = ChronoUnit.MINUTES.between(aniversário, now);

        System.out.println("dias: "+days);
        System.out.println("meses: "+months);
        System.out.println("anos: "+years);
        System.out.println("minutos: "+minutes);


    }
}
