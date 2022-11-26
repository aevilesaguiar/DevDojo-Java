package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTeste02 {
    public static void main(String[] args) throws IOException {
        //150 - Classes Utilitárias - NIO pt 07 - BasicFileAttributes pt 02
        //DosFileAttributes e PosixFileAttributes -> essas classes foram criadas para trabalhar com diferentes sistemas operacionais
        //BasicFileAttributes quando você não quer se preocupar onde será feito o deploy
        //dependendo do lugar onde o seu sistema está sendo executado, a classe correta deveria ser retornada
        //se sabe que vai fazer deploy para o Windows usa->DosFileAttributes  se for fazer deploi para inux usa-> PosixFileAttributes
        //BasicFileAttributes, DosFileAttributes e PosixFileAttributes só fazem a leitura

        //para alterar alguns atributos usamos as classes que terminam com view BasicFileAttributesView, DosFileAttributesView e
        // PosixFileAttributesView elas nos dão métodos que fazer alteração

        Path path = Paths.get("pasta2/new.txt");
                                                                    //esse atributo -> BasicFileAttributes.class quando a classe  Files ler é um objeto que passa no teste BasicFileAttributes
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation time: "+creationTime);
        System.out.println("Last Modified: "+lastModifiedTime);
        System.out.println("last access time: "+lastAccessTime);

        System.out.println("---------------------------------------");

        //BasicFileAttributeView dá a possibilidade de fazer alteração no arquivo
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());//pega o horário de seu sistema operacional
        fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

         creationTime = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation time: "+creationTime);
        System.out.println("Last Modified: "+lastModifiedTime);
        System.out.println("last access time: "+lastAccessTime);


    }
}
