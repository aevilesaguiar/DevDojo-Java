package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(16);
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        System.out.println("----------------------------");


        List<String> nomes2 = Arrays.asList("Claudio, Flavio, Marcio, Mariana");

        for (String listNomes: nomes
             ) {
            System.out.println(listNomes);
        }

        System.out.println("Tamanho lista:"+nomes.size());
        System.out.println("Remove [0]:"+nomes.remove(0));
        System.out.println(nomes);

        System.out.println(nomes.addAll(nomes2));

        for (String listNomes: nomes
        ) {
            System.out.println(listNomes);
        }




        System.out.println("-----------------------------------");
        List<String> employee = Arrays.asList("Fernanda Moreira", "Francisco Cuoco");

        System.out.println(employee);
        for (String employeeList: employee
             ) {
            System.out.println(employeeList);
        }

        System.out.println("-----------------------------------");
        int size= nomes.size();;
        for (int i = 0; i <size ; i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        System.out.println("-----------------------------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for (Integer list:numeros
             ) {
            System.out.println(list);
        }

        numeros.remove(1);
        System.out.println(numeros);


    }



}
