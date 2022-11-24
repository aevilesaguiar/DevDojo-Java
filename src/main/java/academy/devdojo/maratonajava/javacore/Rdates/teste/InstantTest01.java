package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

    //Instant é parecida com a Date , a diferença é que Date trabalha com milisegundos a partir de 1° de janeiro de 1970
    //Instant trabalha com nano segundos
    public static void main(String[] args) {
        //Instant é um objeto imutavel, todas as alterações que você fizer vai gerar uma nova instancia, guarda nanosegundos de 1970 até agora
        Instant now=Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());//retorna praticamente o mesmo , a diferença é o Z, zulutime, é o horário neutro do mundo, ela também é UTC

        //ZuluTime é importante por que se por acaso salvarmos um data no brasil e abrirmos por exemplo na china sabemos o horário
        //por isso quando salvamos no banco apartir do UTC que é o zulu também

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());//NANO SEHUNDO DE UM SEGUNDO 999.999.999

        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));

    }
}
