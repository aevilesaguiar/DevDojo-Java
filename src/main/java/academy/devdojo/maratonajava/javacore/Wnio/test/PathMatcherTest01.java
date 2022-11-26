package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        //PatchMatcher é uma classe que foi criada para facilitar a busca de Paths
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        //glob versão simplificada da expressão regular
        matches(path1,"glob:*.bkp");//eu quero que seja um arquivo terminado em .bkp
        matches(path1,"glob:**/*.bkp");//ignora tudo que tem para trás e colocar/*.bkp , ele ignora todo o diretório para trás, e voc~e pode trocar o asterisco que está proximo da barra
        matches(path1,"glob:**/*.{bkp,java,txt}");//{}->como se fosse um agrupamento separado por virgula, sem espaço;
        matches(path2,"glob:**/*.{ bkp ,java, txt}");//por causa do espaço ele dá false
        matches(path3,"glob:**/*.{ bkp,java,txt}");
        matches(path1,"glob:**/*.???");//não me importo com o diretorio , não me importo com o nome , mas eu quero 3 letras depois do ponto
        matches(path2,"glob:**/file.???");//procurar nome especifico de arquivo ou seja o nome tem que ter file e terminar com tres
        matches(path3,"glob:**/file.????");//procurar nome especifico de arquivo ou seja o nome tem que ter file e terminar com quatro

    }
/*
* glob	Descrição
*.TXT	Corresponde a todos os arquivos que possuem extensão como txt.
*.{html,htm}	Corresponde a todos os arquivos que possuem extensão como html ou htm. { } são usados para agrupar padrões e vírgula é usada para separar padrões.
?.TXT	Corresponde a todos os arquivos que possuem um único caractere como nome e extensão como txt.
*.*	Corresponde a todos os arquivos que possuem extensão . em seu nome.
C:\\Usuários\\*	Corresponde a qualquer arquivo no diretório C: 'Usuários' no sistema de arquivos do Windows. A barra invertida é usada para escapar de um caractere especial.
/casa/**	Corresponde a /home/foo e /home/foo/bar em plataformas UNIX. ** corresponde a cadeias de caracteres que cruzam os limites do diretório.
[xyz].txt	Corresponde a um nome de arquivo com um único caractere 'x' ou 'y' ou 'z' e extensão como txt. Os colchetes [ ] são usados para especificar um conjunto de caracteres.
[ac].txt	Corresponde a um nome de arquivo com um único caractere 'a' ou 'b' ou 'c' e extensão como txt. Hypehen – é usado para especificar um intervalo e usado em [ ]
[!a].txt	Corresponde a um nome de arquivo com um único caractere que não seja 'a'. ! é usado para negação.

O caractere * corresponde a zero ou mais caracteres de um componente de nome sem ultrapassar os limites do diretório.
Os caracteres ** correspondem a zero ou mais caracteres que cruzam os limites do diretório.*/

    private static  void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+matcher.matches(path));
    }
}
