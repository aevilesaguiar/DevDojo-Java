package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
//Referência a um método de instância de um objeto específico	/ Reference to an instance method of a particular object

public class LmabdaMehodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparators comparators=new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Dragon Ball", 1000), new Anime("One piece", 200),new Anime("Naruto",600)));
       //chamando através do objeto
      //  anime.sort(comparators::compareByEpisodesNonStatic);
       // System.out.println(anime);
        //chamando através de lambda
        anime.sort((a1,a2)-> comparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(anime);




    }
}
