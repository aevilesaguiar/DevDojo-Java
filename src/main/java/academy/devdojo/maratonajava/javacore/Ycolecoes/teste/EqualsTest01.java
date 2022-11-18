package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.sql.DataTruncation;

public class EqualsTest01 {
    public static void main(String[] args) {

        //referencias diferentes
        String nome = "Flavio Tavares";
        String nome2 = new String("Flavio Tavares");

        System.out.println(nome==nome2);
        System.out.println(nome.equals(nome2));


        Smartphone smartphone = new Smartphone("1ABC1","iphone");
        Smartphone smartphone2 = new Smartphone("1ABC1","iphone");
        System.out.println(smartphone.equals(smartphone2));


    }

}
