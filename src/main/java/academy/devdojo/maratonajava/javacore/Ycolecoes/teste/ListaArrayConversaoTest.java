package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);


       Integer[] listToArray= numeros.toArray(new  Integer[0]);//utilizado 0 por que o java usa o reflection para encontrar o comprimento
        System.out.println(Arrays.toString(listToArray));

        System.out.println("--------------------");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0]=1;
        numerosArray[1]=2;
        numerosArray[2]=3;

        //não é possivel fazer alteraçãoes quando utilizações o Arrays.asList( );
        //Arrays.asList é imutável, ele antem um link com o array original
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("-----------Permite alteração------------------");//quebra o vinculo que existe no (Arrays.asList(numerosArray)
        List<Integer> numeroList = new ArrayList<>(Arrays.asList(numerosArray));
        numeroList.add(15);
        System.out.println(numeroList);

        //duas formas de criar um arrayList
        List<String> list = Arrays.asList("a","b","c","d");
        System.out.println(list);
        List<String> vogais= List.of("a","e","i","o","u");
        System.out.println(vogais);




    }
}
