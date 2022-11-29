package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));

        List<Barco> barcoList= criarArrayComUmObjeto2(new Barco("Navio"));
        System.out.println(barcoList);


    }

    private  static <T> void  criarArrayComUmObjeto(T t){
        List<T> list=List.of(t);
        System.out.println(list);

    }

    private  static <T> List<T>  criarArrayComUmObjeto2(T t){
        List<T> list=List.of(t);
        return list;

    }
/*
    private  static <T extends Comparable<T>> List<T>  criarArrayComUmObjeto3(Barco t){
        List<T> list=List.of(t);
        return list;

    }*/
}

