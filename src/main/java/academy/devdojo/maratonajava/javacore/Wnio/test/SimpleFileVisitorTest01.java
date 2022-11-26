package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends java.nio.file.SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".java")){//devido esse if -> ele mostra todos os arquivos .java
        System.out.println(file.getFileName());}
        return  FileVisitResult.CONTINUE;


    }
}


public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        //154 - Classes Utilitárias - NIO pt 11 - SimpleFileVisitor pt 01
        //DirectoryStream trás todos os arquivos do mesmo diretório
        //SimpleFileVisitor permite

        //lista tudo que temos no diretorio
        Path root= Paths.get(".");
        Path fileTree = Files.walkFileTree(root,new ListAllFiles());


        //como imprimir todos os arquivos .java e ignorar todo o resto


    }
}
