package academy.devdojo.maratonajava.javacore.Rdates.teste;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;


public class LocalDateTimeTeste {
    //Classes Utilitárias - LocalDateTime
    //muito flexível
    public static void main(String[] args) {

        //junção da LocalTime LocalDate
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        //posso incluir com of ou com Strinh
        LocalDate ld = LocalDate.of(2022, Month.NOVEMBER,23);
        LocalTime lt=LocalTime.of(20,43,56);
        System.out.println(ld);
        System.out.println(lt);

        LocalDate ld2 = LocalDate.parse("2022-11-24");
        LocalTime lt2=LocalTime.parse("22:43:56");
        System.out.println(ld2);
        System.out.println(lt2);

        //fazer junção entre as classes
        LocalDateTime timeJuncao = ld2.atTime(lt2);
        System.out.println(timeJuncao);
        System.out.println("---------------------");
        LocalDateTime juncaoDateTime = lt2.atDate(ld2);
        System.out.println(juncaoDateTime);
        System.out.println("---------------------");
        LocalDateTime timeJuncao2 = ld2.atTime(15,2,23);
        System.out.println(timeJuncao2);



    }
}
