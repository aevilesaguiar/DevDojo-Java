package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //129 - Classes Utilitárias - DateTimeFormatter
        //toda vez que você ouvir format você está transformando do seu Objeto para uma String
        //toda vez que ouvir a palavra parse, você está transformando de uma String para um objeto

        LocalDate date= LocalDate.now();
        //DATAS FORMATADAS EM String
        //transformando do seu Objeto para uma String
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);//VALOR PADRÃO DO LOCALdATE
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("--------------------------------");
        //TRANSFORMAR UMA STRING EM OBJETO
        LocalDate parse = LocalDate.parse("20221124",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);

        LocalDate parse1 = LocalDate.parse("2022-11-24+05:00",DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);

        LocalDate parse2 = LocalDate.parse("2022-11-24",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse2);


        System.out.println("--------------------------------");
        //transformando do seu Objeto para uma String
        LocalDateTime now = LocalDateTime.now();
        String f1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(f1);

        String f2 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(f2);

        String f3 = now.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(f3);


        //TRANSFORMAR UMA STRING EM OBJETO
        LocalDateTime parse3 = LocalDateTime.parse("2022-11-24T08:59:45.5891351",DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse3);

        //criando uma formatação
        //Brasil-> dd/MM/yyyy
        //EUA->MM/dd/yyyy
        //Japão->yyyy/MM/dd

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String br = LocalDate.now().format(formatterBR);
        System.out.println(br);

        LocalDate parse4 = LocalDate.parse("19/05/2022",formatterBR);
        System.out.println(parse4);

        DateTimeFormatter formatterEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String eua = LocalDate.now().format(formatterEUA);
        System.out.println(eua);

        DateTimeFormatter formatterJapao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String japao = LocalDate.now().format(formatterJapao);
        System.out.println(japao);

        DateTimeFormatter formattergr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String gr = LocalDate.now().format(formattergr);
        System.out.println(gr);

        //podemos parsear de volta
        LocalDate parse5 = LocalDate.parse("24.November.2022", formattergr);
        System.out.println(parse5);


    }
}
