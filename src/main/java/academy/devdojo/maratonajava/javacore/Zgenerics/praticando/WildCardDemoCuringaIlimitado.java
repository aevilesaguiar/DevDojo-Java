package academy.devdojo.maratonajava.javacore.Zgenerics.praticando;

import java.util.Arrays;
import java.util.List;

public class WildCardDemoCuringaIlimitado {
    public static void main(String[] args) {

        /*3. Curinga Ilimitado: /3. Unbounded Wildcard:
         *Esse tipo curinga é especificado usando o caractere curinga (?), por exemplo, Lista.
         * Isso é chamado de lista de tipos desconhecidos. Estes são úteis nos seguintes casos:
         *  - Ao escrever um método que pode ser empregado usando a funcionalidade fornecida na classe Object.
         *  - Quando o código está usando métodos na classe genérica que não dependem do parâmetro de tipo**/


        List<Integer> list1= Arrays.asList(4,5,6,3); // Arrays.asList retorna uma lista que pode ser modificada, com ressalvas. Arrays.asList aceita elementos nulos,
        imprime(list1);


        List<Double>list2=Arrays.asList(1.5,5.6,3.4);
        imprime(list2);

    }
public static void imprime(List<?> list){
    System.out.println(list);
}


}
