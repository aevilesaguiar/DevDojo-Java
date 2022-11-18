package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {

        Smartphone smartphone1= new Smartphone("33333","iPhone");
        Smartphone smartphone2= new Smartphone("55555","Motorola");
        Smartphone smartphone3= new Smartphone("22222","Sansung");

        List<Smartphone> list = new ArrayList<>(6);
        list.add(smartphone1);
        list.add(smartphone2);
        list.add(smartphone3);

        for (Smartphone smartphone:list
             ) {
            System.out.println(smartphone);
        }
        Smartphone smartphone4= new Smartphone("22222","Sansung");
        list.add(smartphone4);
        Smartphone smartphone5= new Smartphone("222221","Sansung");



        System.out.println("Existe dentro da lista:"+list.contains(smartphone4));
        System.out.println("Existe dentro da lista:"+list.contains(smartphone5));

        //TRAS O INDICE DAQUELE OBJETO QUE ESTÁ PASSANDO SENÃO EXISTE É -1
        int indexSmartphone3= list.indexOf(smartphone2);
        int indexSmartphone4= list.indexOf(smartphone5);
        System.out.println(indexSmartphone3);
        System.out.println(indexSmartphone4);

        System.out.println(list.get(indexSmartphone3));
       // System.out.println(list.get(indexSmartphone4));




    }
}
