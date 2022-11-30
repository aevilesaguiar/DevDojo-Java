package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {

    public static void main(String[] args) {
        //o of-> quer que você receba um objeto não nulo- Returns an Optional describing the given non-null value.
        Optional<String> o1=Optional.of("Casa ");
        System.out.println(o1);

        //ofNullable Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
        Optional<String> o2=Optional.ofNullable(null);
        System.out.println(o2);

        //emptu-> retorna um Optional vazio
        Optional<String> o3=Optional.empty();
        System.out.println(o3);

        System.out.println("--------------------------------------------");
        Optional<String> name = findName("Willian");

        //é como se se fosse if e else-If a value is present, returns the value, otherwise returns other.
        String empty = name.orElse("Empty");
        System.out.println(empty);

        //If a value is present, performs the given action with the value, otherwise does nothing.- Se um valor estiver presente, executa a ação dada com o valor, caso contrário, não faz nada.
        name.ifPresent(s->System.out.println(s.toUpperCase()));



    }
private static Optional<String> findName(String name){
    List<String> list = List.of("Willian", "DevDojo");
    int i=list.indexOf(name);
    if(i!=-1){
        return Optional.of(list.get(i));
    }
    return Optional.empty();
}

}
