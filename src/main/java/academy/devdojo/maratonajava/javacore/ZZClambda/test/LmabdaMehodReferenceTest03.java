package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
//Referência a um método de instância de um objeto arbitrário de um tipo específico/Reference to an instance method of an arbitrary object of a particular type

public class LmabdaMehodReferenceTest03 {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>( List.of("Ana", "Ted", "Bob", "Fla", "Ric", "Isa"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger1=s->Integer.parseInt(s);
        System.out.println(numStringToInteger1.apply(String.valueOf(10)));


        //semelhante ao Predicate a diferença é que BiPredicate recebe 3 argumentos
        //Predicate faz um test e retorna um boolean
        BiPredicate<List<String>, String> checkName=List::contains;
        System.out.println(checkName.test(list,"Fla"));




    }
}
