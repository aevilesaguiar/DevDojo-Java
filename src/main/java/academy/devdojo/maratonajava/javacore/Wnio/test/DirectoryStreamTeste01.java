package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste01 {
    public static void main(String[] args) {

        //DirectoryStream é uma das formas mais fáceis que nós temos de pegar todos os arquivos de um diretório
        //funciona mais ou menos como dir, ele lista apenas o primeiro level (se eu quiser saber quais são todos os arquivos do
        // diretorio que não estejam no nivel descrito tenho que usar outra classe
        //Generics o java usa para decidir EM TEMPO DE COMPILAÇÃO qual o tipo da classe que ele PRECISA CRIAR(Forma Simplificada CONCEITO)
        Path dir = Paths.get(".");//o ponto(.) ele pega tudo que tem no diretorio atual

        //Geralmente quando se trabalha com IO Stream geralmente temos que chamar o método close para fechar o recurso do Sistema Operacional
        //E também ela extende a classe Closeable tem que chamar  o close()


        //usando o Path no Generics basicamente ele vai pegar cada um dos arquivos que temos na pasta DevDojo-Jva e vai associar um path para cada arquivo que
        //for encontrado
        try(DirectoryStream<Path> stream= Files.newDirectoryStream(dir)) {

            for (Path path:stream
                 ) {
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
