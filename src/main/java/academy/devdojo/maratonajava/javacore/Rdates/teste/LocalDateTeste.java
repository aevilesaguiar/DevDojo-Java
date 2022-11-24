package academy.devdojo.maratonajava.javacore.Rdates.teste;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;


public class LocalDateTeste {
    //Classes Utilitárias - LocalDate
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        //LocalDate só trabalha com hora

        LocalDate date1 = LocalDate.of(2022,12,15);
        System.out.println(date1);

        System.out.println(Month.JANUARY);
        System.out.println(Month.JANUARY.getValue());

        LocalDate date2 = LocalDate.of(2022,Month.NOVEMBER,23);
        System.out.println(date2);//Data está sendo salva conforme o BD
        System.out.println(date2.getYear());
        System.out.println(date2.getDayOfWeek());
        System.out.println(date2.getMonth());
        System.out.println(date2.lengthOfMonth());
        System.out.println(date2.isLeapYear());//verifica se o ano é bissexto
        System.out.println(date2.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date2.get(ChronoField.DAY_OF_YEAR));

        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(agora.plusWeeks(4));//adiciona 4 semanas
        System.out.println(agora.minusWeeks(2));
        System.out.println(agora.plusDays(3));

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);




    }
}
