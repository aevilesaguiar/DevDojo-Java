package academy.devdojo.maratonajava.javacore.Rdates.teste;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;


public class LocalTimeTeste {
    //Classes Utilitárias - LocalDate
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        //LocalTime só trabalha com hora
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime localTime = LocalTime.of(20, 38, 12);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(localTime.MIN);//MINIMO QUE VOC~E PODE PEGAR DO DIA
        System.out.println(localTime.MAX);//MAXIMO QUE VOCÊ PODE PEGAR DO DIA



    }
}
