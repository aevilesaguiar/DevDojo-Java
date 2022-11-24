package academy.devdojo.maratonajava.javacore.ZZZexpressoesRegulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExistenciaDeUmaLetraEmUmaString {
    public static void main(String[] args) {

        String entrada= "Uma frase";
        String regex = "f";

        //Chame Pattern#compile com uma expressão regular como argumento para criar um objeto Pattern.
        Pattern padrao = Pattern.compile(regex);

        //Crie um objeto Matcher invocando o método matcher() de Pattern, passando como argumento a entrada a ser analisada.
        Matcher matcher= padrao.matcher(entrada);
        //Por fim, chame o método find() de Matcher para tentar encontrar uma correspondência entre a expressão regular e os caracteres da entrada.
        // Caso uma correspondência seja encontrada find() devolverá true.
        boolean corresponde= matcher.find();

        System.out.printf("'%s tem correspondencia do padrão '%s' ? %b",entrada,padrao,corresponde);

    }
}
