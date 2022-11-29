package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste.praticando;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicadoEmFiltro2 {

    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9,10,11,12,15);
        Predicate<Integer> maiorQue8=x->x>8;

        List<Integer> collect=nums.stream().filter(maiorQue8).collect(Collectors.toList());
        System.out.println(collect);

    }
}
