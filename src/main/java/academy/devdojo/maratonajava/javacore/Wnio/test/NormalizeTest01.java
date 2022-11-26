package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        //146 - Classes Utilitárias - NIO pt 03 - Normalização
        //normalização é quando você tem dois caminhos , e um dos caminhos diz que você tem que voltar duas pastas
        //normalização é normalizar o seu path
        //resolver basicamente uni caso você tenha dois paths separados
        String diretorioProjeto ="home\\aeviles\\dev";
        String arquivoTxt="../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1); //home\aeviles\dev\..\..\arquivo.txt  -> não está normalizado
        System.out.println(path1.normalize()); //home\arquivo.txt  -> arquivo normalizado


        Path path2 = Paths.get("/home/./aeviles/./dev");
        System.out.println(path2); //\home\.\aeviles\.\dev  -> não está normalizado
        System.out.println(path2.normalize()); //\home\aeviles\dev  -> arquivo normalizado


    }
}
