package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        //variavel de referencial produto e p objeto  new Computador("Ryzen 9",3000);
        Produto produto = new Computador("Ryzen 9",3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("-----------------------------");
        Produto produto1=new Tomate("Italiano",7.99);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());





    }
}
