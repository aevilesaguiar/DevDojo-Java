package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangasSortedTest01 {

    static class MangaByIdComparator implements Comparator<Manga> {

        @Override
        public int compare(Manga manga1, Manga manga2) {
            return manga1.getId().compareTo(manga2.getId());
        }
    }
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Saylor Moon",9.9));
        mangas.add(new Manga(1L,"Dragon Ball",19.9));
        mangas.add(new Manga(4L,"Naruto",16.9));
        mangas.add(new Manga(2L,"Pokemon",14.9));
        mangas.add(new Manga(3L,"My Hero Academy",13.9));
        System.out.println(mangas);
        System.out.println("----------------------------------");
        for (Manga listSemOrdem: mangas
             ) {
            System.out.println(listSemOrdem);
        }
        System.out.println("----------------------------------");
        Collections.sort(mangas);
        for (Manga listOrdenada: mangas
        ) {
            System.out.println(listOrdenada);
        }

        System.out.println("-------------CompareTo---------------------");
        mangas.sort(new MangaByIdComparator());//precisa do objeto new MangaByIdComparator() é 1
        for (Manga listOrdenadaid: mangas
        ) {
            System.out.println(listOrdenadaid);
        }
    }
}
