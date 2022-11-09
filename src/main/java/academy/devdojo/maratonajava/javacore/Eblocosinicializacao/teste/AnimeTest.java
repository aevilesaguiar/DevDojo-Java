package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime= new Anime("one piece");

        System.out.println(anime.getEpisodios());

        System.out.println("----------------------------------");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }



    }
}
