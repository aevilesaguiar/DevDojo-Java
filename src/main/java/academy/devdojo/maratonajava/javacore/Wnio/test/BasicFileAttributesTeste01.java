package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTeste01 {
    public static void main(String[] args) throws IOException {
        //149 - Classes Utilitárias - NIO pt 06 - BasicFileAttributes pt 01

        //como faz para trabalhar com atributos básicos
        //Atributos básicos associados a um arquivo em um sistema de arquivos.
        //Atributos de arquivo básicos são atributos comuns a muitos sistemas de arquivos e consistem em atributos
        // de arquivo obrigatórios e opcionais, conforme definido por esta interface.
        //Ela foi criada para dar possibilidade de você usar polimorfismo baseado no SO
        //a partir dessa interface BasicFileAttributes foram introduzidas outras

        //BasicFileAttributes -> interface mais geral

        //DosFileAttributes -> basicamente é uma implementação da BasicFileAttributes , lembrando que DOS é mais voltado para o windows
        //todos os métodos que temos na DosFileAttributes é apenas para leitura, você não altera nada

        //PosixFileAttributes -mais voltadas para o sistema Unix


        //ainda não alteramos um atributo de uma arquivo

        //Aprender como trocar a data que esse arquivo foi modificado
        LocalDateTime date=LocalDateTime.now().minusDays(10);

        File file = new File("pasta2/arquivo.txt");
        boolean isCreate = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());


        //fazendo a mesma alteração usando o pacote NIO
        Path path2 = Paths.get("pasta2/novo_path.txt");
        Files.createFile(path2);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));

        //PARA MODIFICAR
        Path pathmodificado = Files.setLastModifiedTime(path2, fileTime);
        System.out.println(pathmodificado);
        System.out.println(Files.isWritable(path2));
        System.out.println(Files.isReadable(path2));
        System.out.println(Files.isExecutable(path2));


    }
}
