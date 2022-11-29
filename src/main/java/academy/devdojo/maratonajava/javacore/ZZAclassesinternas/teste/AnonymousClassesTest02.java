package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameCmparator implements Comparator<Barco>{

    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}


public class AnonymousClassesTest02 {

    public static void main(String[] args) {
        List<Barco> barcoList=new ArrayList<>(List.of( new Barco("Lancha"),new Barco("Canoa")));//mesmo usando o List.Of a lista não é imutável por que está dentro do ArrayList

        barcoList.sort(new BarcoNameCmparator());

            //da maneira mais antiga com classe anônima
        //criando uma classe anonima que implementa a interface Comparator<Barco>
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });



        //da maneira mais recente com Lambda
        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        System.out.println(barcoList);

    }
}
