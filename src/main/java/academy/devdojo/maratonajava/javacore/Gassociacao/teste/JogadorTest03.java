package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        //associação bidirecional

        Jogador j1 = new Jogador("Marcelo");
        Jogador j2 = new Jogador("Richarlisson");

        Time time= new Time("Seleção Brasileira");
        Jogador[] jogadors={j1,j2};

        j1.setTime(time);
        time.setJogadors(jogadors);

        System.out.println("-------Jogador---------");
        j1.imprime();
        j2.imprime();
        System.out.println("---------Time------------");
        time.imprime();

    }
}
