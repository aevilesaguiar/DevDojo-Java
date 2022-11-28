package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor= new Consumidor("William Suanne");
        System.out.println(consumidor);

        Consumidor consumidor2= new Consumidor("Dev Dojo Academy");
        System.out.println(consumidor2);

        System.out.println("-----------------------");

        Manga manga1= new Manga(5L,"Saylor Moon",9.9);
        Manga manga2= new Manga(1L,"Dragon Ball",19.9);
        Manga manga3= new Manga(4L,"Naruto",16.9);
        Manga manga4= new Manga(2L,"Pokemon",14.9);
        Manga manga5= new Manga(3L,"My Hero Academy",13.9);

        //consumidor chave, manga valor
        Map<Consumidor,Manga> consumidorMangaMap= new HashMap<>();
        consumidorMangaMap.put(consumidor,manga1);
        consumidorMangaMap.put(consumidor2,manga2);

        for (Map.Entry<Consumidor, Manga> entry:consumidorMangaMap.entrySet()
             ) {
            System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
        }

    }
}
