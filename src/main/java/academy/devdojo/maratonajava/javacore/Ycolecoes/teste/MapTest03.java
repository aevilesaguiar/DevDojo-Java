package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
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

        List<Manga> mangaConsumidor1List=List.of(manga1,manga2,manga3);
        List<Manga> mangaConsumidor2List=List.of(manga4,manga1,manga5);

        //Um consumidor compra vários mangás
        Map<Consumidor, List<Manga>> consumidorMangaMap= new HashMap<>();
        consumidorMangaMap.put(consumidor,mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2,mangaConsumidor2List);

        for(Map.Entry<Consumidor,List<Manga>> entry: consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            System.out.println("........................");
            for (Manga list: entry.getValue()
                 ) {
                System.out.println(list.getNome()+" - "+list.getPreco());
            }
            System.out.println("***********************");
        }



    }
}
