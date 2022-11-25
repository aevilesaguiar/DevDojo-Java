package academy.devdojo.maratonajava.javacore.Ventradaesaidadedadosio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTeste {
    public static void main(String[] args)  {

        //FileReader: classe utilizada para ler dados de arquivos de texto


        File file=new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\textoAdicionado.txt");


        //criação do FileWrite com Resourses
        try (FileReader fr= new FileReader(file)){//quando usamos try com resources ele fecha automaticamente,fr.close();
            char[] in=new char[500000];//conta a quantidade de caracteres lidos
           // int size= fr.read(in);
           // System.out.println(size);
/*
            //escrevendo no arquivo
            fr.read(in);
            for (char c:in
                 ) {
                System.out.println(c);
            }*/

            int i;
            while ((i=fr.read())!=-1){
               // System.out.print(i);
                System.out.print((char) i);//ler o texto inteiro/arquivo inteiro
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
