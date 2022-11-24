package academy.devdojo.maratonajava.javacore.Uregex;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest05 {
    public static void main(String[] args) {

        //ALGUNS METACARACTERES IMPORTANTES
        //\d: retorna todos os digitos
        //\D: retorna tudo que não for digitos
        //\s: retorna todos os espaços em branco e pode ser (\t \n \f \r -> caracteres que representam espaços em branco)
        //\S: retorna todos os caracteres excluindo os brancos
        //\w: retorna tudo que for de a-ZA-Z ou seja todas as letras, todos os digitos e underscore
        //\W: retorna tudo que não for de a-ZA-Z ou seja todas as letras, todos os digitos e underscore
        //se eu colocar [abcABC] quer dizer que quero letras maiúsculas e minúsculas é como se colocasse um OU
        //se eu colocar [a-zA-C] quer dizer que quero letras de a-z minusculas e A-C maiusculas
        // [] : representa um range de caracteres, se eu colocar [abc] eu estou dizendo que ele procure por a ou b ou c todos minusculos
        //(interrogação que é ) ? Zero ou uma ocorrencia
        //*  Zero ou mais ocorrencias
        // +  Zero uma ou mais ocorrências
        //{n,m} de n até m (pegar de 5 a 10 ocorrencias por exemplo)
        //()-> metacartere de agrupamento
        //| ->0(v|c0)  encontra no texto o que tiver v ou c
        //$ representa o fim da linha
        // .(caractere curinga)  Ex: 1.3=123,133,1@3,1a3 ele considera tudo que está entre 1 e 3


         String regex1="([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //expressão regular

        String texto2="luffy@hotmail.com, 123jotaro@gmail, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";//encontrar os padrões de emails válidos

        System.out.println("Email válido ?");
        System.out.println("#@!zoro@mail.br".matches(regex1));
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(texto2.split(",")));
        System.out.println("------------Remover espaços em branco------------------");
        System.out.println(texto2.split(",")[1].trim());
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




    }
}
