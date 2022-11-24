package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest03 {
    public static void main(String[] args) {

        //ALGUNS METACARACTERES IMPORTANTES
        //\d: retorna todos os digitos
        //\D: retorna tudo que não for digitos
        //\s: retorna todos os espaços em branco e pode ser (\t \n \f \r -> caracteres que representam espaços em branco)
        //\S: retorna todos os caracteres excluindo os brancos
        //\w: retorna tudo que for de a-ZA-Z ou seja todas as letras, todos os digitos e underscore
        //\W: retorna tudo que não for de a-ZA-Z ou seja todas as letras, todos os digitos e underscore
        // [] : representa um range de caracteres, se eu colocar [abc] eu estou dizendo que ele procure por a ou b ou c todos minusculos
        //se eu colocar [abcABC] quer dizer que quero letras maiúsculas e minúsculas é como se colocasse um OU
        //se eu colocar [a-zA-C] quer dizer que quero letras de a-z minusculas e A-C maiusculas
        String regex="[a-zA-C]"; //expressão regular

        String texto="cAZfeBABE"; //achar abc

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

        String regex1="0[xX][0-9a-fA-F]"; //expressão regular

        String texto2="12 0X ox 0xFFABC 0x109 0x1";

            //Expressões regulares precisam ser compiladas
        Pattern pattern1= Pattern.compile(regex1);
        //encontra o padrão
        Matcher matcher1= pattern1.matcher(texto2);

        System.out.println("texto: "+texto2);
        System.out.println("indice:0123456789");
        System.out.println("regex: "+regex1);

        //java procurando as expressões regulares
        while (matcher1.find()){
            System.out.print(matcher1.start()+" "+matcher1.group()+"\n");
        }

        System.out.println("---------------");
        int numeroHex=0xDF; //o x pode ser maiusculo ou minusculo
        System.out.println(numeroHex);


    }
}
