package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles02 extends java.nio.file.SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".java")){//devido esse if -> ele mostra todos os arquivos .java
        System.out.println(file.getFileName());}
        return  FileVisitResult.CONTINUE;

    }
    //ele é invocado quando entra num diretório
    //é como se fosse um gatilho, mas não tem garantia que ele faça sempre esse comporatmento
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        System.out.println("pre visit: "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }


    //BASICAMENTE SE ELE TENTAR LER UM ARQUIVO E ELE NÃO TIVER  permissão de leitura, ou tiver qualquer tipo de problema
    //ele lança essa exceção, você pode usar o visitFileFailed  para exibir, ler um log....
    //visit
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    //o contrario de previsit, esse postVisitDirectory é invocado quando você está saindo de um diretório
    //ele só é invocado para um diretório após todas as entradas desse diretório todos os seus descendentes terem sido
    //visitados
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit: "+dir.getFileName());
        return FileVisitResult.CONTINUE;
        //SUBtREE não funciona no post
    }
}


public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        //154 - Classes Utilitárias - NIO pt 11 - SimpleFileVisitor pt 01
        //DirectoryStream trás todos os arquivos do mesmo diretório
        //SimpleFileVisitor permite

        //lista tudo que temos no diretorio
        Path root= Paths.get("pasta");
        Path fileTree = Files.walkFileTree(root,new ListAllFiles02());


        //como imprimir todos os arquivos .java e ignorar todo o resto


    }
}
