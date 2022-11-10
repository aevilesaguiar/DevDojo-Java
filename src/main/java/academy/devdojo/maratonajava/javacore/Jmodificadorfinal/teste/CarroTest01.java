package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        double velocidadelimite = Carro.VELOCIDADELIMITE;
        System.out.println(velocidadelimite);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Janaina");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari= new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();



    }
}
