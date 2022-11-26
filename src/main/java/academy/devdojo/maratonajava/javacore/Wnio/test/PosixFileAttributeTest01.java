package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/aeviles/file.txt");

        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        //imprimir as permissões no ubuntu
        System.out.println(posixFileAttributes.permissions());


        //alterar as  permissões
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);

        //criar as permissões
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        fileAttributeView.setPermissions(posixFilePermissions);

        //ver se as permissões foram alteradas
        System.out.println(fileAttributeView.readAttributes().permissions());
    }
}
