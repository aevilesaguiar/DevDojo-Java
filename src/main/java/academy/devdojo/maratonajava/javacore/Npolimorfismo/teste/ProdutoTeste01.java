package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000.00);
        computador.setGarantia("1 ano");
        Tomate tomate = new Tomate("Tomate italiano",10);
        Televisao televisao = new Televisao("Sansung 50\" ",5000);



        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
