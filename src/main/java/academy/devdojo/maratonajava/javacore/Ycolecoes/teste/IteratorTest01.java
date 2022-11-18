package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Saylor Moon",9.9,0));
        mangas.add(new Manga(1L,"Dragon Ball",19.9,5));
        mangas.add(new Manga(4L,"Naruto",16.9,6));
        mangas.add(new Manga(2L,"Pokemon",14.9,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        System.out.println(mangas);

        //não usar foreach para fazer remoção
        //uma maneira de remover usar Iterator
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){

        }

    }
}
