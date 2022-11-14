package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        //variavel de referencial produto e p objeto  new Computador("Ryzen 9",3000);
        Computador computador = new Computador("Ryzen 9",3000);
        computador.setGarantia("1 ano");
        Tomate tomate=new Tomate("Italiano",7.99);
        tomate.setDataValidade("11/12/2022");




        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------------");
        CalculadoraImposto.calcularImposto(computador);





    }
}
