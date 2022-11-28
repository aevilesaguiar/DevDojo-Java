package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuTest01 {
    public static void main(String[] args) {

        //queue = fila - first one, first out
        //precisa que quando você estiver adicionando a classe que foi definida no generics, preica obrigatorio ser um Comparable
        Queue<String> fila = new PriorityQueue<>();//Essa classe foi criada para trabalhar com prioridades customizadas
        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String s:fila
             ) {
            System.out.println(s);
        }

        System.out.println(fila);

        //peek-> retorna o primeiro elemento
        //pool-> remove o elemento cabeça da fila (desinfileiramento)
        //remove()-> remove o primeiro elemento

        while(!fila.isEmpty()){

            System.out.println(fila.poll());
        }
    }
}
