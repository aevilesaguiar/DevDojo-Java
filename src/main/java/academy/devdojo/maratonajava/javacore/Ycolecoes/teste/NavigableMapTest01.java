package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        NavigableMap<String,String> map= new TreeMap<>(); //Ordena pela chave , não precisa comparara pelo Comparable
        map.put("A","Letra A");
        map.put("D","Letra D");
        map.put("B","Letra B");
        map.put("C","Letra C");
        map.put("E","Letra E");
        map.put("E","Letra E");

        for (Map.Entry<String, String> entry: map.entrySet()
             ) {
            System.out.println(entry.getKey() + " - "+entry.getValue());
        }

        System.out.println("----------------");
        System.out.println(map.headMap("C"));//RETORNA TODO MUNDO QUE ESTÁ ABAIXO DA LETRA C
      //  System.out.println();
       //System.out.println(map.headMap("C").remove("A"));//RETORNA TODO MUNDO QUE ESTÁ ABAIXO DA LETRA c E REMOVE A 'A'
        System.out.println(map.headMap("C",true));//RETORNA TODO MUNDO QUE ESTÁ ABAIXO DA LETRA C  E INCLUI TAMBÉM A CHAVE QUE ESTOU PASSANDO NESSE CASO C

               //esses métodos , são métodos para comparação
              //lower < (o que é imediatamente menor)  System.out.println(map.ceilingKey());
              //floor <=(o mesmo elemento ou o imediato abaixo dele)
              //higher>(primeiro maior)
              //ceiling>=(leva em consideração o valor que eu estou passsando)


        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.ceilingKey("C"));
    }


}
