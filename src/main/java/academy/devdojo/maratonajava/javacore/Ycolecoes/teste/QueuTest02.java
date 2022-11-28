package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuTest02 {
    public static void main(String[] args) {

        //queue = fila - first one, first out
        //Por que PriorityQueue? por que podemos definir a prioridade, a importancia

        Queue<Manga> mangas=new PriorityQueue<>(new mangaPrecoComparator().reversed());//revertir para ordenar pelo o maior valor
        mangas.add(new Manga(5L,"Saylor Moon",9.9,0));
        mangas.add(new Manga(1L,"Dragon Ball",19.9,5));
        mangas.add(new Manga(4L,"Naruto",16.9,6));
        mangas.add(new Manga(2L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        mangas.add(new Manga(3L,"My Hero Academy",13.9,0));
        mangas.add(new Manga(10L,"Aaragon",13.9,0));

        //peek-> retorna o primeiro elemento
        //pool-> remove o elemento cabeça da fila (desinfileiramento)
        //remove()-> remove o primeiro elemento

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }


    }
}
