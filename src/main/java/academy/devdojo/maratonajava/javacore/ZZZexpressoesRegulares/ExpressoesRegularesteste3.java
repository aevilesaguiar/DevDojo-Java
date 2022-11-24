package academy.devdojo.maratonajava.javacore.ZZZexpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesteste3 {
    public static void main(String[] args) {
        //no java se usa duas classes para se trabalhar com expressões regulares
        //Pattern(Primeira classe trabalha com padrões) e Matcher(e a segunda classe que encontra esses padrões)
        //expressões regulares começam da esquerda para a direita e uma vez  que aquela posição foi usada e la não será usada novamente
        //se um caracter já tiver tido um match geralmente ela não usa novamente
        //meta caracteres ajuda a facilitar a busca por determinados caracteres
        
        //\D ele busca num texto tudo o que não for dígito e também @, *
        String regex = "\\D";
        String texto = "@hab1278abbvhgsa02121";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }


    }
}
