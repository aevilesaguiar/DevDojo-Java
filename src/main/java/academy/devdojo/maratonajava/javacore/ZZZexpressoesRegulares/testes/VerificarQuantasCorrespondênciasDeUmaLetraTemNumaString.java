package academy.devdojo.maratonajava.javacore.ZZZexpressoesRegulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarQuantasCorrespondênciasDeUmaLetraTemNumaString {
    public static void main(String[] args) {

        String entrada = "Essa frase tem seis s.";
        String regex = "s";

        //Crie um objeto Pattern.
        Pattern padrao = Pattern.compile(regex);
        //A partir do Pattern, instancie um Matcher.
        Matcher matcher= padrao.matcher(entrada);
        //Por fim, chame o método find() de Matcher para tentar encontrar uma correspondência entre a expressão regular e os caracteres da entrada.
        // Então chame find() até obter false.
        int correspondencias=0;
        while ((matcher.find())){
            correspondencias++;
        }

        System.out.println(correspondencias);



    }
}
