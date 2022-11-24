package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    //Classes Utilitárias - SimpleDateFormat
    //SimpleDateFormat seu objetivo é trabalhar com formatação de data utilizando os padrões da letra da documentação
    public static void main(String[] args) {
        String pattern="yyyy.MM.dd G 'at' HH:mm:ss z";//aspas simples é usada para tudo aquilo que você quer igonar no momento da conversão
        String pattern2="'Diadema' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2=new SimpleDateFormat(pattern2);

        String format = sdf.format(new Date());
        System.out.println(format);


        String format2 = sdf2.format(new Date());
        System.out.println(format2);


        //temos o parse também

        try {
            System.out.println(sdf2.parse("Diadema 23 de novembro de 2022"));//quando ele faz o parse ele trás com date
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    /*
    *
Letter Date or Time Component	              Presentation	Examples
G	    Era designator	                            Text	AD
y	    Year	                                    Year	1996; 96
Y	    Week year	                                Year	2009; 09
M	    Month in year	                            Month	July; Jul; 07
w	    Week in year	                            Number	27
W	    Week in month	                            Number	2
D	    Day in year	                                Number	189
d	    Day in month	                            Number	10
F	    Day of week in month	                    Number	2
E	    Day name in week	                        Text	Tuesday; Tue
u	    Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
a	    Am/pm marker	                            Text	PM
H	    Hour in day (0-23)	                        Number	0
k	    Hour in day (1-24)	                        Number	24
K	    Hour in am/pm (0-11)	                    Number	0
h	    Hour in am/pm (1-12)	                    Number	12
m	    Minute in hour	                            Number	30
s	    Second in minute	                        Number	55
S	    Millisecond	                                Number	978
z	    Time zone	General time zone	            Pacific Standard Time; PST; GMT-08:00
Z	    Time zone	RFC 822 time zone	            -0800
X	    Time zone	ISO 8601 time zone	             -08; -0800; -08:00
*
*
Date and Time Pattern	        Result
"yyyy.MM.dd G 'at' HH:mm:ss z"	2001.07.04 AD at 12:08:56 PDT
"EEE, MMM d, ''yy"	            Wed, Jul 4, '01
"h:mm a"	                    12:08 PM
"hh 'o''clock' a, zzzz"	        12 o'clock PM, Pacific Daylight Time
"K:mm a, z"	                     0:08 PM, PDT
"yyyyy.MMMMM.dd GGG hh:mm aaa"	02001.July.04 AD 12:08 PM
"EEE, d MMM yyyy HH:mm:ss Z"	Wed, 4 Jul 2001 12:08:56 -0700
"yyMMddHHmmssZ"                	010704120856-0700
"yyyy-MM-dd'T'HH:mm:ss.SSSZ"	2001-07-04T12:08:56.235-0700
"yyyy-MM-dd'T'HH:mm:ss.SSSXXX"	2001-07-04T12:08:56.235-07:00
"YYYY-'W'ww-u"	                2001-W27-3
* */
}
