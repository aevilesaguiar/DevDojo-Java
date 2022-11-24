package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest02 {
    public static void main(String[] args) {

        //ALGUNS METACARACTERES IMPORTANTES
        //\d: retorna todos os digitos
        //\D: retorna tudo que não for digitos
        //\s: retorna todos os espaços em branco e pode ser (\t \n \f \r -> caracteres que representam espaços em branco)
        //\S: retorna todos os caracteres excluindo os brancos
        //\w: retorna tudo que for de a-ZA-Z ou seja todas as letras, todos os digitos e underscore
        //\W: retorna tudo que não for de a-ZA-Z ou seja todas as letras, todos os digitos e underscore
        String regex="\\W"; //expressão regular

        String texto="hh\n2@12g vh#_";

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
            System.out.println(matcher.start()+" "+matcher.group()+" ");
        }
        System.out.println("");



    }
}
