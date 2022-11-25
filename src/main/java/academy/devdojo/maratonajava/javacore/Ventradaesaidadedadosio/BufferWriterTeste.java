package academy.devdojo.maratonajava.javacore.Ventradaesaidadedadosio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTeste {
    public static void main(String[] args)  {
        //FileWriter e FileReader são classes low level, não foram criadas com pensamento de performance
        //se estiver pensando em performance é importante usar a BufferedWriter/BufferedReader

        File file=new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\file2.txt");

        //criação do FileWrite com Resourses
        try ( FileWriter fw= new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw)){//quando usamos try com resources ele fecha automaticamente,fw.close();
            //escrevendo no arquivo
            bw.write("O dev dojo é legal!");//nem todos os S.O. usam /n por isso oBufferWriter criou o newLine()
            bw.newLine();
            bw.write("A árvore da montanha olê ia a ô");
            bw.newLine();
            bw.write("A árvore da montanha olê ia a ô");
            bw.flush();//Limpa os buffers desse fluxo e faz com que todos os dados armazenados em buffer sejam gravados no arquivo.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
