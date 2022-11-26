package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//input é quando você está lendo
//output você está mandando para algum lugar
public class ZipOutpuStreamTest01 {//nesse caso ele gera um zip
    //quando ver nesse caso Stream você está trabalhando com dados de baixo nível, praticamente binário
    public static void main(String[] args) {

        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivosParaZipar);

    }

    //
    private static void zip(Path arquivoZip, Path arquivosParaZipar){

        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
            for (Path file : directoryStream) {

               //esse objeto é o que eu tô preparando-> estou preparando o objeto
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                //colocou o esqueleto do arquivo dentro do zip atraves do zip streamputNextStream
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();

            }
            System.out.println("Arquivo criado com sucesso");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
