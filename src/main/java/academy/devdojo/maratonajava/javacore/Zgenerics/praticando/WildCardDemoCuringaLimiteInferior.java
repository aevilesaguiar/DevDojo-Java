package academy.devdojo.maratonajava.javacore.Zgenerics.praticando;

import java.util.Arrays;
import java.util.List;

public class WildCardDemoCuringaLimiteInferior {
    public static void main(String[] args) {

        /*2. Curingas de limite inferior:/2. Lower Bounded Wildcards:
         *É expresso usando o caractere curinga ('?'), seguido da palavra-chave super, seguida de seu
        * limite inferior: <? SuperA>.
        * Sintaxe: Tipo de coleção <? superA> */


        List<Integer> list1= Arrays.asList(4,5,6,3); // Arrays.asList retorna uma lista que pode ser modificada, com ressalvas. Arrays.asList aceita elementos nulos,
        imprimeSomenteInteiro(list1);

    }

    /**
     * Aqui os argumentos podem ser Integer ou superclasse de Integer (que é Number).
     * o método imprimeSomenteInteiro aceitará apenas Integer ou seus objetos de superclasse.
     * No entanto, se passarmos uma lista de tipos Double, obteremos um erro de compilação.
     * É porque somente o campo Integer ou sua superclasse podem ser passados. Double não é
     * a superclasse de Integer.*/

   public static void imprimeSomenteInteiro(List<? super Integer> list){
       System.out.println(list);
   }


}
