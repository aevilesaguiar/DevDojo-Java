package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class LmabdaTest02 {
    public static void main(String[] args) {

        List<String> strings = List.of("João", "Maria", "Daniel");
        System.out.println(strings);
        List<Integer> map2 = map(strings, (String s) -> s.length());
        System.out.println(map2);
        List<String> map = map(strings, s -> s.toUpperCase());
        System.out.println(map);

        List<String> map1 = map(strings, s -> s.toLowerCase());
        System.out.println(map1);


    }

    //T-> TIPO R-> RETORNO   eu quero retornar uma lista de R
    private static <T,R> List<R> map(List<T> list, Function<T,R> function){

        List<R> result = new ArrayList<>();

        for (T e:list
             ) {
            R r =function.apply(e);
            result.add(r);
        }
        return result;
    }
}
