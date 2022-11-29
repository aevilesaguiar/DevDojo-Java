package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste.praticando;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicadoFiltroTest {
    public static void main(String[] args) {

        Predicate<String> startWithA=x->x.startsWith("A");

        List<String> list= Arrays.asList("A","Ana","AAAA","AAA","Beber","bb","Viver");

        System.out.println(StringProcessr.filter(list,x->x.startsWith("A")));
        System.out.println(StringProcessr.filter(list,x->x.startsWith("A")&& x.length()==3));

    }

    class StringProcessr{
        static List<String> filter(List<String> list, Predicate<String> predicate){
            return list.stream().filter(predicate::test).collect(Collectors.toList());
        }
    }
}
