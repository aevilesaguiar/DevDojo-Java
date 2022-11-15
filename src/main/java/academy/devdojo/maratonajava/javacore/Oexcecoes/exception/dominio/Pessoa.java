package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LogininvalidoException, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
