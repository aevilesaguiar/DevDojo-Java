package academy.devdojo.maratonajava.javacore.Ventradaesaidadedadosio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        //143 - Classes Utilitárias - IO pt 06 - File para diretórios
        File fileDiretorio=new File("C:\\JAVA\\DevDojo-Jva\\diretorio");

        boolean criarDiretorio = fileDiretorio.mkdir();
        System.out.println(criarDiretorio);

        //crriar arquivo dentro do diretorio
        File criarArquivoDiretorio=new File("C:\\JAVA\\DevDojo-Jva\\diretorio\\pastaDiretorio2.txt");
        try {

            boolean isFileCreate = criarArquivoDiretorio.createNewFile();
            System.out.println("Pasta Criada? "+isFileCreate);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //outra maneira de criar arquivo sem informar o path
        File criarArquivoDiretorio2= new File(fileDiretorio,"arquivo.txt");
        try {
            boolean newFile = criarArquivoDiretorio2.createNewFile();
            System.out.println("Criar arquivo? "+newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //renomear um arquivo

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean renameTo = criarArquivoDiretorio2.renameTo(fileRenamed);
        System.out.println("Renomear Arquivo?"+renameTo);

        //renomear diretorio

        File diretorioRenamed = new File("diretorio2");
        boolean renameTo1 = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Renomear Diretorio?"+renameTo1);


    }
}
