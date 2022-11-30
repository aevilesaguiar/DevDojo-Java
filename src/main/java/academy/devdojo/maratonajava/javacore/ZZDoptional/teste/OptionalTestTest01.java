package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import java.util.List;

public class OptionalTestTest01 {

    //dessa forma gerava o nullPointer Excpetion
    public static void main(String[] args) {
        String name = findName("willian");
        System.out.println(name.toUpperCase());


    }
private static String findName(String name){
    List<String> list = List.of("Willian", "DevDojo");
    int i=list.indexOf(name);
    if(i>0){
        return list.get(i);
    }
    return null;
}

}
