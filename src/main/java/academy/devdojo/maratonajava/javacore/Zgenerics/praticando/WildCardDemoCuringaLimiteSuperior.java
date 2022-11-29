package academy.devdojo.maratonajava.javacore.Zgenerics.praticando;

import java.util.Arrays;
import java.util.List;

public class WildCardDemoCuringaLimiteSuperior {
    public static void main(String[] args) {

        /*1. Curingas de limites superiores:/ Upper Bounded Wildcards:
         * Esses curingas podem ser usados quando você deseja relaxar as restrições de uma variável. Por exemplo,
        * digamos que você queira escrever um método que funcione em List < Integer >, List < Double > e List < Number >,
        * você pode fazer isso usando um curinga de limite superior. Para declarar um curinga de limite superior,
        * use o caractere curinga ('?'), seguido pela palavra-chave extends, seguida por seu limite superior.
        * public static void add(List<? extends Number> list)**/


        List<Integer> list1= Arrays.asList(4,5,6,3); // Arrays.asList retorna uma lista que pode ser modificada, com ressalvas. Arrays.asList aceita elementos nulos,
        System.out.println(soma(list1));


        List<Double>list2=List.of(1.5,5.6,3.4);// enquanto List.of retorna uma lista que não pode ser modificada, List.of não aceita elementos nulos
        System.out.println(soma(list2));//

    }

/**No programa acima, list1 e list2 são objetos da classe List. list1 é uma coleção de Integer e list2 é uma coleção de Double.
 * Ambos estão sendo passados para o método sum, que possui um curinga que estende Number. Isso significa que
 * a lista que está sendo passada pode ser de qualquer campo ou subclasse desse campo. Aqui, Integer e Double são subclasses da classe Number.*/

    private static double soma(List<? extends Number> list){

        double somar=0.0;
        for (Number number:list
             ) {
            somar+=number.doubleValue();
        }
        return somar;
    }


}
