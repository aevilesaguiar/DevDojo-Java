package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime= new Anime();
        //anime.setTipo("TV");
        //anime.setEpisodios(12);
        //anime.setNome("Dragon Ball");
        anime.init("Dragon Ball","TV",15,"Ação");
        anime.init("Dragon Ball z",36);

        anime.imprime();




    }
}
