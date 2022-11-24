package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        //Calendar veio depois de Date (segunda tentativa para concertar o problemas que Calendar tinham.
        //não pode instanciar a classe Calendar ela é abstrata
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df= new DateFormat[7];
        df[0]=DateFormat.getInstance(); //23/11/2022 15:48
        df[1]=DateFormat.getDateInstance();//23 de nov. de 2022
        df[2]=DateFormat.getDateTimeInstance();//23 de nov. de 2022 15:48:50
        df[3]=DateFormat.getDateInstance(DateFormat.SHORT);//23/11/2022
        df[4]=DateFormat.getDateInstance(DateFormat.MEDIUM);//23 de nov. de 2022
        df[5]=DateFormat.getDateInstance(DateFormat.LONG);//23 de novembro de 2022
        df[6]=DateFormat.getDateInstance(DateFormat.FULL);//quarta-feira, 23 de novembro de 2022

        for (DateFormat dateFormat:df
             ) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
