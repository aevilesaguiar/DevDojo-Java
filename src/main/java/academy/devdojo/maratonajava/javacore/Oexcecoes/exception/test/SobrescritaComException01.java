package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.LogininvalidoException;
import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LogininvalidoException e) {
           e.printStackTrace();
        }


    }
}
