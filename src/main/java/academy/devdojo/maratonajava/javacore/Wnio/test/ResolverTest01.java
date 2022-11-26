package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolverTest01 {
    public static void main(String[] args) throws IOException {
        //147 - Classes Utilitárias - NIO pt 04 - Resolvendo Paths
        //resolver vai resolver colocando dois caras juntos
        //resolver basicamente uni caso você tenha dois paths separados


        Path pathRelativo = Paths.get("home/aeviles");//caminho relativo
        Path pathAbsoluto = Paths.get("/home/aeviles");//caminho absoluto


        Path dir = Paths.get("home/aeviles");
        Path arquivo = Paths.get("dev/arquivo.txt");

        //resolveu a url/juntar os paths
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/aeviles");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("files.txt");
        System.out.println("1 "+absoluto.resolve(relativo));//\home\aeviles\dev
        System.out.println("2 "+absoluto.resolve(file));//\home\aeviles\files.txt
        System.out.println("3 "+relativo.resolve(absoluto));//\home\aeviles
        System.out.println("4 "+relativo.resolve(file));//dev\files.txt
        System.out.println("5 "+file.resolve(absoluto));// \home\aeviles
        System.out.println("6 "+file.resolve(relativo));//files.txt\dev


    }
}
