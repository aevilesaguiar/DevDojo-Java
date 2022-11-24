package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

    //https://www.rfc-editor.org/rfc/rfc4647
    //https://www.rfc-editor.org/rfc/rfc5646
    public static void main(String[] args) {
        //Como o nome sugere, a classe util.Locale é usada para executar tarefas de localidade e fornece informações de localidade para o usuário.
        //Locale foi criada para trabalhar com nacionalização, ela formata datas, moedas e numeros, baseados na preferencia do usuario ou localização da JVM dele
        //Locale segue o padrão da ISO
        //ISO 639 é formado por "Códigos para a representação de nomes de línguas" Ex:pt
        //https://en.wikipedia.org/wiki/List_of_ISO_3166_country_codes
        // o padrão ISO 3166 – Códigos para a representação de nomes de países e suas subdivisões . Ex: BR
        //ex:pt-BR
        Locale localeItaly=new Locale("it","IT");
        Locale localeSuica=new Locale("it","CH");
        Locale localeIndia=new Locale("hi","IN");
        Locale localeJapao=new Locale("ja","JP");
        Locale localeHolanda=new Locale("nl","NL");
        Locale localeBrasil=new Locale("pt","BR");

        Calendar calendar= Calendar.getInstance();
        DateFormat dfSuica=DateFormat.getDateInstance(DateFormat.FULL,localeSuica);//Formata como se estívessemos na Itália
        System.out.println("Suiça "+dfSuica.format(calendar.getTime()));//diferença é a vírgula
        DateFormat dfItaly= DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        System.out.println("Italia "+dfItaly.format(calendar.getTime()));
        DateFormat dfIndia=DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        System.out.println("India "+dfIndia.format(calendar.getTime()));
        DateFormat dfJapao=DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        System.out.println("Japão "+dfJapao.format(calendar.getTime()));
        DateFormat dfHolanda=DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);
        System.out.println("Holanda "+dfHolanda.format(calendar.getTime()));
        System.out.println("-----------------------------------------------------");
        System.out.println("SO Japão país Suiça: "+localeSuica.getDisplayCountry( localeJapao));
        System.out.println("SO Itália país Italia: "+localeItaly.getDisplayCountry(localeIndia));
        System.out.println("SO Holanda país India: "+localeIndia.getDisplayCountry(localeHolanda));
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println(localeHolanda.getDisplayCountry());


    }
}
