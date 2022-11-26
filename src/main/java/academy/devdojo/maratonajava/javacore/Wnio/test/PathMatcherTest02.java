package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest02 {


    static class  FindAllTestJavaOrClass extends SimpleFileVisitor<Path>{

        //glob
        private PathMatcher matcher= FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if (matcher.matches(file)){
                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
    }
    public static void main(String[] args) {

        //Exercicio -> Usar SimpleFileVisitor e PatchMatcher, retorne todos os arquivos desse diretorio
        //que tenham Test no nome ou que tenha a extensão .java ou .class
        Path root = Paths.get(".");
        try {
            Files.walkFileTree(root, new FindAllTestJavaOrClass());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
