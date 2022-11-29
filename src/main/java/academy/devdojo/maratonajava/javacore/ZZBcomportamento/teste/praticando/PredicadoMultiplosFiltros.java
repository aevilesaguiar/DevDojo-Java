package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste.praticando;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicadoMultiplosFiltros {

    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9,10,11,12,15);


        List<Integer> collect=nums.stream()
                .filter(x->x>8 && x<12).collect(Collectors.toList());
        System.out.println(collect);

    }
}
