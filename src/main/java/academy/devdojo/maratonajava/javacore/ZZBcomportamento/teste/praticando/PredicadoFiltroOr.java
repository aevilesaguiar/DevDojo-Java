package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste.praticando;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicadoFiltroOr {
    public static void main(String[] args) {
        Predicate<String> lengthIs3=x->x.length()==3;
        Predicate<String> startWithA=x->x.startsWith("A");

        List<String> list= Arrays.asList("A","Ana","AAAA","AAA","Beber","bb","Viver");

        List<String> collect = list.stream().filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect);


        List<String> collect2 = list.stream().filter(lengthIs3.and(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect2);

    }
}
