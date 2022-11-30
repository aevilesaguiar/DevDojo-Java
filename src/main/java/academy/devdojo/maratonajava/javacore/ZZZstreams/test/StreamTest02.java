package academy.devdojo.maratonajava.javacore.ZZZstreams.test;

//1.Ordene os LigthNovel by title
//2.Retrieve the first 3 titles ligth novels with price less than 4()(Recupere os 3 primeiros Ligth novels com preço inferior a 4)

import academy.devdojo.maratonajava.javacore.ZZZstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {

    //streams é uma sequencia de elementos, eles estão no tempo, por que estamos trabalhando com a sequencia, você não está guardando absolutamente nada.
    //quando falamos em coleções estamos falando em elementos num espaço, onde vc está guardando seus dados suas coleções estamos falando de memória
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

        //a maioria das coleções tem um método chamado stream
        //As operações de uma stream, tem duas opções, ou elas são intermediárias ou são finais.
        //ação intermediária: uma ação intermediária é uma ação que ela retorna o próprio stream, você pode encadear ações, voc~e quer filtrar, ordenar...
        //As operações terminais são inválidas ou retornam um resultado não stream.
        //Essa cadeia de operações de fluxo, conforme vista no exemplo acima, também é conhecida como pipeline de operação.


        List<String> titles = listLigthNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))//ordena
                .filter(ln -> ln.getPrice() <= 4) //filtra
                .limit(3) //limita
                .map(LightNovel::getTitle)//pega o titulo
                .collect(Collectors.toList());//agrupa tudo numa lista de titulos

        System.out.println(titles);

    }
}
