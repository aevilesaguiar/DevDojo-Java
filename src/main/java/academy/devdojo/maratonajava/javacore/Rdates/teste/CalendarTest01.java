package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        //Calendar veio depois de Date (segunda tentativa para concertar o problemas que Calendar tinham.
        //não pode instanciar a classe Calendar ela é abstrata
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        if(c.getFirstDayOfWeek()==Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println("-----------------------------------------------");
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.YEAR));

        c.add(Calendar.DAY_OF_MONTH, 2);

       // c.add(Calendar.HOUR,2);
        c.roll(Calendar.HOUR,12);

        System.out.println("------------------------------------------------");
        Date date= c.getTime();
        System.out.println(date);

    }
}
