package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        //vamos usar para pegar um Path
        //Path é uma interface, Um objeto que pode ser usado para localizar um arquivo em um sistema de arquivos.
        // Ele normalmente representará um caminho de arquivo dependente do sistema. (parece o File)

        Path p1 = Paths.get("C:\\JAVA\\DevDojo-Jva\\arquivo\\b.txt");//baseada no sistema operacional que vocês está trablhando
        System.out.println(p1.getFileName());


        //ler um arquivo em um determinado diretorio
        Path p2 = FileSystems.getDefault().getPath("C:\\JAVA\\DevDojo-Jva\\arquivo\\","textoAdicionado.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(p2, StandardCharsets.UTF_8);
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------------------------------------");
        //outras formas de você pegar o mesmo arquivo

        Path p3 = Paths.get("C:\\JAVA\\DevDojo-Jva\\arquivo\\b.txt");
        System.out.println("Nome do Arquivo: "+p3.getFileName());
        System.out.println("Path do Arquivo: "+p3.getRoot());
        System.out.println(p3.getFileSystem());
        Path p4 = Paths.get("C:\\JAVA\\DevDojo-Jva\\arquivo","file2.txt");
        System.out.println(p4);
        Path p5 = Paths.get("C","JAVA\\DevDojo-Jva\\arquivo","b.txt");
        System.out.println(p5);
        Path p6 = Paths.get("C","JAVA","DevDojo-Jva","arquivo","b.txt");//o Path se encarrega de montar o caminho
        System.out.println(p6);



    }
}
