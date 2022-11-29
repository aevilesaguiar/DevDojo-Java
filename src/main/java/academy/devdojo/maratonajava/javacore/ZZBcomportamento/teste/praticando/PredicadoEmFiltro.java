package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste.praticando;

import java.util.List;
import java.util.stream.Collectors;

public class PredicadoEmFiltro {

    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9,10,11,12,15);
        List<Integer> collect=nums.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> pares=nums.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(pares);
    }
}
