package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste.praticando;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicadoFiltroNegate {
    public static void main(String[] args) {

        Predicate<String> startWithA=x->x.startsWith("A");

        List<String> list= Arrays.asList("A","Ana","AAAA","AAA","Beber","bb","Viver");


        List<String> collect = list.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
