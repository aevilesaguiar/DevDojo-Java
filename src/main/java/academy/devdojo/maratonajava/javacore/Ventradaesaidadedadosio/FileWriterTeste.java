package academy.devdojo.maratonajava.javacore.Ventradaesaidadedadosio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste {
    public static void main(String[] args)  {
        //FileWriter e FileReader são classes low level, não foram criadas com pensamento de performance
        //se estiver pensando em performance é importante usar a BufferedWriter/BufferedReader

        //File: trabalha com o arquivo em si. Obtendo informações de arquivos e diretórios
        //Objetos dessa classe irão servir para objetos de outras classes da java.io package.
        //A sua função está relacionada com o caminho / diretório / endereço dos arquivos ou diretório que desejarmos manipular.

        //File Writer : A classe Java FileWriter é usada para gravar dados orientados a caracteres em um arquivo . É uma
        // classe orientada a caracteres que é usada para manipulação de arquivos em java. Esta classe herda da classe
        // OutputStreamWriter que, por sua vez, herda da classe Writer. Ela é uma classe para escrever no arquivo, mas não é muito bem otimizada

        //FileReader: classe utilizada para ler dados de arquivos de texto

        //BufferedWriter: servem para escrever em arquivos de texto, é semelhante a FileWriter, mas além de ter um desempenho melhor,
        // possui alguns métodos que são independentes de sistema operacional, como quebra de linhas.

        //BufferedReader: BufferedReader é semelhante a classes FileReader e servem para ler arquivos em formato texto.

        File file=new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\file.txt");

        //criação do FileWrite com Resourses
        try ( FileWriter fw= new FileWriter(file);){//quando usamos try com resources ele fecha automaticamente,fw.close();
            //escrevendo no arquivo
            fw.write("O dev dojo é legal! \n A árvore da montanha olê ia a ô\n A árvore da montanha olê ia a ô");
            fw.flush();//Limpa os buffers desse fluxo e faz com que todos os dados armazenados em buffer sejam gravados no arquivo.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2=new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\textoAdicionado.txt");


        //o arquivo acima ele substitui os dados do arquivo caso eu altere o texto, no có código abaixo ele adiciona, tipo faz um append
        //toda vez que eu rodar o código ele adiciona o texto.
        try ( FileWriter fw= new FileWriter(file2, true);){//quando usamos try com resources ele fecha automaticamente,fw.close();
            //escrevendo no arquivo
            fw.write("O dev dojo é legal! \n A árvore da montanha olê ia a ô\n A árvore da montanha olê ia a ô");
            fw.flush();//Limpa os buffers desse fluxo e faz com que todos os dados armazenados em buffer sejam gravados no arquivo.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
