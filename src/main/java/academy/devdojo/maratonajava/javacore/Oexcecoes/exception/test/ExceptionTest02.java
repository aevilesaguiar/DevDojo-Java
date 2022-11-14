package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args){

        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean criado= file.createNewFile();
            System.out.println("Arquivo criado: "+criado);
        } catch (IOException e) {
            //imprime tudo o que aconteceu na stack para você poder identificar
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo");
        }
    }
}