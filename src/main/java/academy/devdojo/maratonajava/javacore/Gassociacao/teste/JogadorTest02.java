package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        //associação unidirecional

        Jogador j1 = new Jogador("Marcelo");

        Time time= new Time("Seleção Brasileira");

        j1.setTime(time);
        j1.imprime();

    }
}
