package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Analistas;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Anderson",5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Fernando",12000);
        System.out.println(desenvolvedor);

        Analistas analistas = new Analistas("João",2000);
        System.out.println(analistas);
        gerente.imprime();
        desenvolvedor.imprime();
        analistas.imprime();
    }
}
