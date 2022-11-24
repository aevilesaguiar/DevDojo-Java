package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {

    public static void main(String[] args) {
        List <String> list= List.of("Flavio","Ana", "Maria", "Sueli");
        //forEach(list, (String s)-> System.out.println(s));
        forEach(list, (String s)-> System.out.println(s));//deixar mais enxuto

        List<Integer> list1=List.of(1,2,3,4,5,6);
       // forEach(list1,(Integer i)-> System.out.println(i));
        forEach(list1,(i)-> System.out.println(i));//deixar mais enxuto
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e :list){
            consumer.accept(e);
        }
    }
}
