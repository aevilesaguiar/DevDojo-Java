package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.principal;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setIdade(36);
        funcionario.setSalarios (new double[]{25696.00,158265.36,1526.36});

        funcionario.imprimirDados();

        System.out.println("Média "+funcionario.getMedia());


    }
}
