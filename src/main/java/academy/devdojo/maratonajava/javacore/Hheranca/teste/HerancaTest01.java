package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01
{
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Fernando, 01");
        endereco.setCep("63289-963");

        Pessoa pessoa=new Pessoa("João da Silva");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("123456789-96");
        pessoa.imprime();

        System.out.println("----------------------------------");
        Funcionario funcionario= new Funcionario("Felipe");
        funcionario.setCpf("123456852-96");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5263.96);

        funcionario.imprime();



    }
}
