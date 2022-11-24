package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new HashSet<>();//coleção que permite apenas elementos unicos, e os elementos serão organizados baseado no hash, o set não é indexado, você navega pela coleção, podemos usar foreach
        mangas.add(new Manga(5L,"Saylor Moon",9.9,0));
        mangas.add(new Manga(1L,"Dragon Ball",19.9,5));
        mangas.add(new Manga(4L,"Naruto",16.9,6));
        mangas.add(new Manga(2L,"Pokemon",14.9,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        System.out.println(mangas);

        for (Manga manga: mangas
             ) {
            System.out.println(manga);
        }


    }
}
