package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest01 {
    public static void main(String[] args) {

        String regex="ab"; //expressão regular
        String texto="abaaba";

        //duas classes que precisamos para trabalhar com Regex
        //Pattern : é o padrão
        //Matcher : o que encontra o padrão

        //Expressões regulares precisam ser compiladas
        Pattern pattern= Pattern.compile(regex);
        //encontra o padrão
        Matcher matcher= pattern.matcher(texto);

        System.out.println("texto: "+texto);
        System.out.println("indice:0123456789");
        System.out.println("regex: "+regex);

        //java procurando as expressões regulares
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
        System.out.println("");

        String regex2="aba"; //expressão regular
        String texto2="ababababtodo dia ababaaba";

        //Expressões regulares precisam ser compiladas
        Pattern pattern1=Pattern.compile(regex2);
        //encontra o padrão
        Matcher matcher1=pattern1.matcher(texto2);
        System.out.println("regex2 :"+regex2);

        while (matcher1.find()){
            System.out.print(matcher1.start()+" ");
        }


    }
}
