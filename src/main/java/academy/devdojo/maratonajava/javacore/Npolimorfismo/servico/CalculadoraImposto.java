package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static  void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        produto.calcularImposto();
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("IMposto a ser pago: "+imposto);

        //ele irá executar esse código se somente se o objeto que o produto está fazendo uma referencia é uma instancia de tomate
        if (produto instanceof Tomate){
            //Tomate tomate = (Tomate) produto; isso aqui é igual a baixo

            System.out.println("Validade: "+((Tomate) produto).getDataValidade());
        }

        if(produto instanceof  Computador){
            Computador computador = (Computador) produto;
            System.out.println("Garantia de: "+computador.getGarantia());
        }




    }
}
