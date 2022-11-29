package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        //antes do Generic era dessa forma
        //não se forçada o tipo
        List lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Ane");
        lista.add("Ted");
        lista.add("Tod");
        lista.add(125L);
        lista.add(1);
        lista.add(1.25);

        for (Object o:lista
             ) {

            //se o o é uma instancia de STRING...DOUBLE...Integer
            if (o instanceof String){
                System.out.println(o);
            }
            if (o instanceof Double){
                System.out.println(o);
            }

            if (o instanceof Long){
                System.out.println(o);
            }


            if (o instanceof  Integer){
                System.out.println(o);
            }
        }


        // motivação de estudar Generics em Java é de poupar o desenvolvedor de códigos redundantes, como é o caso de casting excessivo.

        //através do generics podemos criar uma classe só e, a partir dessa classe, instanciar objetos de diferentes tipos, de acordo com a nossa escolha.

        //Generics permite que tenhamos algoritmos que possam ser aplicados independentes de tipo. Ou seja, criamos um
        // código cujo parâmetro é o tipo ao qual ele é aplicado. O uso mais comum de Generics está em algoritmos para implementação de coleções.

        //com o genérics percebemos que ele força o tipo
        //e não podemos por exemplo incluir numa lista de String um Long, int, double...
        //caso usemos dessa forma temos que converter para string, mas o ideal é apenas usar o tipo String

        List<String> list = new ArrayList<>();//type erasure->por que ele está apagando o tipo depois que o código é compilado.
        list.add("Ana");
        list.add("Ane");
        list.add("Ted");
        list.add("Tod");
        list.add(String.valueOf(125L));
        list.add(String.valueOf(1));
        list.add(String.valueOf(1.25));

        System.out.println(list);

        add(list,new Consumidor("Aevilés"));




    }

//o Generics faz a validação em tempo de compilação, ele não deixa seu codigo passar para a JVM com o tipo incorreto
    private static void add(List list, Consumidor consumidor){
        list.add(consumidor);

        for (Object o:list
             ) {
            System.out.println(o);
        }
    }
}
