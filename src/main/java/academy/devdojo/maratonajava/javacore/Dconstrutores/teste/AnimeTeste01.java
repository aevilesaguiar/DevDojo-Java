package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Casa de Papel","TV",20,"Ação");

        anime.imprime();
        System.out.println("------------------------------");

        Anime anime2 = new Anime("Casa de Papel","TV");


        Anime anime1= new Anime("Dragon Ball Z","tv",26,"Ação", "Production Akyma");
        anime1.imprime();


        System.out.println("------------------------------");



    }
}
