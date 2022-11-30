package academy.devdojo.maratonajava.javacore.ZZZstreams.test;

//1.Ordene os LigthNovel by title
//2.Retrieve the first 3 titles ligth novels with price less than 4()(Recupere os 3 primeiros Ligth novels com preço inferior a 4)

import academy.devdojo.maratonajava.javacore.ZZZstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> listLigthNovels=new ArrayList<>(List.of(
            new LightNovel("ZDragon Ball",3.99,153),
            new LightNovel("DDragon Ball Z",2.99,291),
            new LightNovel("Eragon Ball GT",10.99,64),
            new LightNovel("BDragon Ball kai",15.99,153),
            new LightNovel("CDragon Ball",12.99,167),
            new LightNovel("Dragon Ball Super",29.99,87),
            new LightNovel("ADragon Ball super  Heroes",35.99,45)
    ));
    public static void main(String[] args) {
        //comparing() -> Aceita uma função que extrai uma chave de classificação Comparable de um tipo T e retorna um
        // Comparator<T> que compara por essa chave de classificação.
        //O comparador retornado é serializável se a função especificada também for serializável.

        //ordenado por titulo
        listLigthNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> tittles= new ArrayList<>();


        //CLASSIFICA POR TITULO
        for (LightNovel l:listLigthNovels
             ) {
            System.out.println(l);
        }

        //CLASSIFICA POR PREÇO
        for (LightNovel l:listLigthNovels
             ) {
            if(l.getPrice()<=4){
               tittles.add(l.getTitle()) ;
            }
            if(tittles.size()>=3){
                break;
            }
        }
        System.out.println("--------------------");
        System.out.println(listLigthNovels);
        System.out.println("--------------");
        System.out.println(tittles);

    }
}
