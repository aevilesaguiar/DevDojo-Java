package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.*;
import java.time.temporal.ChronoUnit;


//Duration periodo de tempo baseados em segundos e nano segundos

public class DurationTest01 {
    public static void main(String[] args) {
      //Duration é uma classe que foi ccriada para trabalhar com a quantidade de tempo
        //ela geralmente é usada uando queremos pegar um intervalo de tempo entre duas datas
        //baseada em segundos e nanosegundos , para trabalhar com Durantion eu tenho que usar classes que
        //usem segundos ou nanosegundos

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(15).plusSeconds(59);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeAffterTwoYears = LocalTime.now().minusHours(7);

        //dURATION DIFERENTE DE OUTRAS CLASSES não tem duration.now()
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);//PT17544H -> iso 8601  -> P=PERIODO  T=TEMPO H=HORAS M=MINUTES S=SEGUNDOS D=DIAS W=SEMANAS M=MES Y=ANO

        Duration d2 = Duration.between(timeNow, timeAffterTwoYears);
        System.out.println(d2);//PT17544H -> iso 8601  -> P=PERIODO  T=TEMPO H=HORAS M=MINUTES S=SEGUNDOS D=DIAS W=SEMANAS M=MES Y=ANO

        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        System.out.println(d3);//PT17544H -> iso 8601  -> P=PERIODO  T=TEMPO H=HORAS M=MINUTES S=SEGUNDOS D=DIAS W=SEMANAS M=MES Y=ANO

        ///cuidado quando trabalhar com Duration usando LocalDate , pois LocalDate não tem segundos

        Duration d4 = Duration.ofDays(20);//ele retorna em horas, ou seja 20 dias é equivalente a PT480H -> 480 horas
        System.out.println(d4);

        Duration of = Duration.of(3, ChronoUnit.DAYS);
        System.out.println(of);//72horas


    }
}
