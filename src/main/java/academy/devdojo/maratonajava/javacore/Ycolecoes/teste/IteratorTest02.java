package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest02 {
    public static void main(String[] args) {

        //linkedList é mais indicado para fazer remoção
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Saylor Moon",9.9,0));
        mangas.add(new Manga(1L,"Dragon Ball",19.9,5));
        mangas.add(new Manga(4L,"Naruto",16.9,6));
        mangas.add(new Manga(2L,"Pokemon",14.9,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        System.out.println(mangas);

        System.out.println("---------------------------------");

        //não usar foreach para fazer remoção
        //uma maneira de remover usar Iterator
   //     Iterator<Manga> mangaIterator = mangas.iterator();
       /* while (mangaIterator.hasNext()){
            Manga manga= mangaIterator.next();
            if(manga.getQuantidade()==0){
                mangaIterator.remove();
            } ou */

    /*   while (mangaIterator.hasNext()){
            if(mangaIterator.next().getQuantidade()==0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);*/



       mangas.removeIf(manga -> manga.getQuantidade()==0);//por debaixo dos panos usa o Iterator


        System.out.println(mangas);
        //não é indicado fazer uma remoção com foreach
       /* for (Manga manga:  mangas){
            if (manga.getQuantidade()==0){
                mangas.remove(manga);
            }
        }*/

    }
}
