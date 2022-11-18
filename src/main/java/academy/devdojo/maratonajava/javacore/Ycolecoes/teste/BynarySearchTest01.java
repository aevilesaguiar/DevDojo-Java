package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BynarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,20,39,0,3,6);
        //Bynary search segue a seguinte regra
        //(-(ponto de inserção )-1)
        // indice 0,1,2,3,4,5
        //value[0, 1, 3, 6, 20, 39]
        Collections.sort(numeros);//para usar o bynary search precisamos ordenar a lista senão não será confiavel o resultado
        System.out.println(numeros);
        System.out.println(Collections.binarySearch(numeros,2));



    }
}
