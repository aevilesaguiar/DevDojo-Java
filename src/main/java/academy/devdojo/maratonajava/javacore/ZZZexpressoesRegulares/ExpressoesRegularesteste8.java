package academy.devdojo.maratonajava.javacore.ZZZexpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesteste8 {
    public static void main(String[] args) {

        //[abc] quando você usa os colchetes você está dizendo procure nessa frase apenas ab ou a letra c
       //imprimir um numero hexadecimal
       // int numeroHex=0X100F;
        String regex = "0[Xx][0-9a-fA-F]";//"[a-zA-C0-9]";procura de A a z minusculo e e a a Z maiusculo etambém numeros
        String texto = "12 0x 0X OxFFABC 0x10G 0x1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group());
        }




    }


}
