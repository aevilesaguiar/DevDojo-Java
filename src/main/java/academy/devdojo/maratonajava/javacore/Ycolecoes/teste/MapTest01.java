package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        //Map sempre terá uma chave valor
        //para adicionar valor é put()
       // Map<String, String> map = new HashMap<>();//segue a ordem do nome
        Map<String, String> map = new LinkedHashMap<>();//segue a ordem de inserção
        map.put("teclado", "mouse");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("vc", "você2");//o put caso a chave seja o mesmo valor ele sobrescreve
        //adiciona caso não exista
        map.putIfAbsent("vc","voccê");
        System.out.println(map);
        for (String valor: map.values()
             ) {
            System.out.println(valor);
        }

        for (String key: map.keySet()
             ) {
            System.out.println(key+": "+map.get(key));
        }

        System.out.println("---------------------------------");
        //pega chave e valor
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());

        }

    }
}
