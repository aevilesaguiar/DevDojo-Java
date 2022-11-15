package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    @Override
    public void salvar() throws LogininvalidoException{
        System.out.println("Salvando funcionario");
    }
}
