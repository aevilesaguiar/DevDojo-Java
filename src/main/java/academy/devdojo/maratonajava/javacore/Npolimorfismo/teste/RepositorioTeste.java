package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();

        Repositorio repositorio2=new RepositorioMemoria();
        repositorio2.salvar();

        List <String> list = new ArrayList<>();
        list.add("Goku");
        System.out.println(list);

        List<String> list1= Arrays.asList("Maria", "João", "Pedro");
        System.out.println(list1);

    }
}
