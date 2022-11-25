package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //vamos usar para pegar um Path
        //Path é uma interface, Um objeto que pode ser usado para localizar um arquivo em um sistema de arquivos.
        // Ele normalmente representará um caminho de arquivo dependente do sistema. (parece o File)

        //pegar diretorio e criar pasta
        Path pastaPath = Paths.get("C:\\JAVA\\DevDojo-Jva\\directorypath");// seria equivalente a new File(pasta)
        //criar diretorio -> quando é apenas uma pasta
            if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
                System.out.println(pastaDirectory.getFileName());
            }

        //pegar diretorio e criar subpastas...
        Path subPastaPath = Paths.get("C:\\JAVA\\DevDojo-Jva\\pasta\\subpasta\\subsubpasta");// seria equivalente a new File(pasta)
        Path subpastaDirectories = Files.createDirectories(subPastaPath);
        System.out.println(subpastaDirectories);


        //criar arquivo
        Path filePath=Paths.get(subPastaPath.toString(),"file.txt");
        //para contornar o problema da Exception .FileAlreadyExistsException usamos o if
        if (Files.notExists(filePath)){
            Path filePathCreatedFileName = Files.createFile(filePath);
        }

        //copiar um arquivo e renomear
        Path source = filePath;//source =origem
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed2.txt");//target=destino, usei o getparent() que é o pai onde ele se encontra
        //Path copy = Files.copy(source, target);
       // System.out.println(copy);
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
