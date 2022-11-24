package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.GregorianCalendar;
import java.util.Map;

//trabalhar com datas e zonas ao mesmo tempo
public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.print(shortIds);
        /*
        * ECT=Europe/Paris,
        * PRT=America/Puerto_Rico,
        * CTT=Asia/Shanghai,
        * SST=Pacific/Guadalcanal,
        *  MST=-07:00,
        * AST=America/Anchorage,
        * NST=Pacific/Auckland,
        * HST=-10:00,
        * ACT=Australia/Darwin,
        * BST=Asia/Dhaka,
        * AET=Australia/Sydney,
        * IST=Asia/Kolkata,
        * CST=America/Chicago,
        * NET=Asia/Yerevan,
        * AGT=America/Argentina/Buenos_Aires,
        * CAT=Africa/Harare,
        * MIT=Pacific/Apia,
        * BET=America/Sao_Paulo,
        * PST=America/Los_Angeles,
        * ART=Africa/Cairo,
        * JST=Asia/Tokyo,
        *  VST=Asia/Ho_Chi_Minh,
        * IET=America/Indiana/Indianapolis,
        *  CNT=America/St_Johns,
        * PLT=Asia/Karachi,
        * PNT=America/Phoenix,
        * EST=-05:00,
        * EAT=Africa/Addis_Ababa}*/

        System.out.println();
        //saber a zona do meu sistema Operacional
        System.out.println(ZoneId.systemDefault());
        //pegar uma zona diferente
        ZoneId asiaZone= ZoneId.of("Asia/Karachi");
        System.out.println(asiaZone);

        LocalDateTime now = LocalDateTime.now();//localDateTime Não oferece nenhum tipo de zona
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(asiaZone);
        System.out.println(zonedDateTime);//2022-11-24T08:21:43.544567+05:00[Asia/Karachi]  para saber a hora na Asia eu adiciono +05:00

        //Instant é parecida com a Date , a diferença é que Date trabalha com milisegundos a partir de 1° de janeiro de 1970
        Instant nowInstant=Instant.now();//trabalha com zuluTime horário neutro do mundo,
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(asiaZone);
        System.out.println(zonedDateTime1);//2022-11-24T16:24:23.200475200+05:00[Asia/Karachi] -> trás o horario a aprtir do zulutime


        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        //deixa trabalhar com a zona usando horários
        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime2);//o horário que está em manaus agora

        //trabalhar com um calendário específico
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 15);
        JapaneseDate japaneseDate1 = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(japaneseDate1);


    }
}
