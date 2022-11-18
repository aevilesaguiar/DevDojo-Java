package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest01 {



    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Saylor Moon");
        mangas.add("Dragon Ball");
        mangas.add("Naruto");
        mangas.add("Pokenom");
        mangas.add("My Hero Academy");

        //Ordena a lista por ordem alfabética
        Collections.sort(mangas);

        for (String list: mangas
             ) {
            System.out.println(list);
        }


        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(100.20);
        dinheiros.add(99.20);
        dinheiros.add(1.20);
        System.out.println(dinheiros);

        Collections.sort(dinheiros);

        for (Double listDin: dinheiros
             ) {
            System.out.println(listDin);
        }

        System.out.println(dinheiros);





    }
}
