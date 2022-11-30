package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MehodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Dragon Ball", 1000), new Anime("One piece", 200),new Anime("Naruto",600)));
        //Comparator com lambda
        //Collections.sort(anime,(a1,a2)->a1.getTitle().compareTo(a2.getTitle()));
        //System.out.println(anime);

        //chamando o método que está no AnimeComparators
        //Collections.sort(anime,(a1,a2)-> AnimeComparators.compareByTitle(a1,a2));
        //System.out.println(anime);

        //usando o Method Reference
        Collections.sort(anime, AnimeComparators::compareByTitle);
        System.out.println(anime);

        //comparando episodes
        Collections.sort(anime,AnimeComparators::compareByEpisodes);
        System.out.println(anime);



    }
}
