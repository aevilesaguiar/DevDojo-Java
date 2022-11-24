package academy.devdojo.maratonajava.javacore.ZZZexpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesteste7 {
    public static void main(String[] args) {

        //[abc] quando você usa os colchetes você está dizendo procure nessa frase apenas ab ou a letra c
        String regex = "[abcABC]";//procura um range de caracteres e digitos
        String texto = "cafeBABE";
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
