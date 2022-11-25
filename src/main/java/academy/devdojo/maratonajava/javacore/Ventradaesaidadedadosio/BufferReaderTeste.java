package academy.devdojo.maratonajava.javacore.Ventradaesaidadedadosio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTeste {
    public static void main(String[] args)  {

        //FileReader: classe utilizada para ler dados de arquivos de texto


        File file=new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\file2.txt");


        //criação do FileWrite com Resourses
        try (FileReader fr= new FileReader(file);
             BufferedReader br=new BufferedReader(fr)){//quando usamos try com resources ele fecha automaticamente,fr.close();
            String linha;
            while ((linha=br.readLine())!=null){
                System.out.println(linha);
            }
            br.readLine();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
