package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BynarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Saylor Moon",9.9));
        mangas.add(new Manga(1L,"Dragon Ball",19.9));
        mangas.add(new Manga(4L,"Naruto",16.9));
        mangas.add(new Manga(2L,"Pokemon",14.9));
        mangas.add(new Manga(3L,"My Hero Academy",13.9));
        for (Manga listManga: mangas){
            System.out.println(listManga);
        }

        Collections.sort(mangas);
        System.out.println("------------------------------------------");

        for (Manga listManga: mangas){
            System.out.println(listManga);
        }
        System.out.println("------------------------------------------");

        //manga que quero buscar
        Manga mangaToSearch = new Manga(3L,"My Hero Academy",13.9);
        System.out.println(Collections.binarySearch(mangas,mangaToSearch));

    }
}
