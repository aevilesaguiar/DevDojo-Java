package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;


/* TreeSet precisa implementat Comparator
* Constrói um novo conjunto de árvores vazio, classificado de acordo com o comparador especificado. Todos os elementos
* inseridos no conjunto devem ser mutuamente comparáveis pelo comparador especificado: comparator.compare(e1, e2)
* não deve lançar uma ClassCastException para quaisquer elementos e1 e e2 no conjunto. Se o usuário tentar adicionar um
* elemento ao conjunto que viole essa restrição, a chamada add lançará uma ClassCastException.
* Por isso foi criado a classe abaixo*/
class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

    class mangaPrecoComparator implements Comparator<Manga>{

        @Override
        public int compare(Manga o1, Manga o2) {
            return Double.compare(o1.getPreco(),o2.getPreco());
        }
    }

public class NavigableSetTest01
{
    public static void main(String[] args) {
        /*A interface Java NavigableSetjava.util.NavigableSet , , é um subtipo da interface Java SortedSet . Portanto,
        o NavigableSetse comporta como um SortedSet, mas com um conjunto adicional de métodos de navegação disponíveis
        além dos mecanismos de classificação do SortedSet*/

        //não permite inserir elementos duplicados pois ele extende SortedSet que extende Set
        NavigableSet navigableSet = new TreeSet();
        navigableSet.add("Ana");
        navigableSet.add("Van");
        navigableSet.add("Fla");
        navigableSet.add("Ana");

        for (Object list :navigableSet
             ) {
            System.out.println(list);
        }

        //O descendingSet()método retorna um NavigableSetno qual a ordem dos elementos é invertida em relação a este.
        // A "exibição" retornada é apoiada pelo original NavigableSet, portanto, as alterações no conjunto descendente
        // também são refletidas no conjunto original.

        NavigableSet reverse=navigableSet.descendingSet();
        System.out.println(reverse);

        NavigableSet<Smartphone> set=new TreeSet<>(new SmartphoneMarcaComparator());//passamos o Comparator diretamente na criação do TreeSet
        Smartphone smartphone = new Smartphone("12", "Nokia");
        set.add(smartphone);

        System.out.println(smartphone);
        //A exceção ClassCastException é um erro de tempo de execução que ocorre quando tentamos fazer um cast
        // (coerção - conversão explícita) de uma classe para outra classe diferente desta ou que não seja uma superclasse desta.


        NavigableSet<Manga> mangas = new TreeSet<>(new mangaPrecoComparator());//coleção que permite apenas elementos unicos, e os elementos serão organizados baseado no hash, o set não é indexado, você navega pela coleção, podemos usar foreach
        mangas.add(new Manga(5L,"Saylor Moon",9.9,0));
        mangas.add(new Manga(1L,"Dragon Ball",19.9,5));
        mangas.add(new Manga(4L,"Naruto",16.9,6));
        mangas.add(new Manga(2L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        mangas.add(new Manga(10L,"Aaragon",13.9,0));

        for (Manga manga : mangas
        ){
            System.out.println(manga);
        }


        //quando devemos usar TreeSet? utiliza quando a classe que você está criando a coleção implementa Comparable ou caso
        // voê não tenha comparable , você tenha que tenha um Comparator. E toda vez que você inserir um elemento TreeSet Fará a ordenação
        //dos elementos, levando em consideração o comparable ou comparator, e não aceita repetição.

        //o treeset ele falha em obdecer o método do set, ele não utiliza o equals para verificar se dois elementos são iguais
        //ele se baseia no método Comparable ou Comparator

        System.out.println("-----------------------------------");

        //inverter Ordem -> descendingSet()
        for (Manga manga:mangas.descendingSet()
             ) {
            System.out.println(manga);
        }

        //esses métodos , são métodos para comparação
        //lower < (o que é imediatamente menor)
        //floor <=(o mesmo elemento ou o imediato abaixo dele)
        //higher>(primeiro maior)
        //ceiling>=(leva em consideração o valor que eu estou passsando)

        System.out.println("-------------------------------------------------");
        Manga yuyu= new Manga(21L, "YUYU Hakusho",3.25,5);
        System.out.println(mangas.lower(yuyu));//menor preço antes do 3.2
        System.out.println(mangas.floor(yuyu));//o mesmo elemento ou o imediato abaixo dele
        System.out.println(mangas.higher(yuyu));//primeiro maior preço
        System.out.println(mangas.ceiling(yuyu));// o valor maior ou igual

        System.out.println("----------------------------");
        //remover os elementos da lista
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}
