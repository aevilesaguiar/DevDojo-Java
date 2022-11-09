package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class TesteJogador {
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Gabriel Jesus");
        Jogador j2 = new Jogador("Pedro");
        Jogador j3 = new Jogador("Danilo");
        Jogador j4 = new Jogador("Eder Militão");

        //formas de declarar o array
        //Jogador[] jogadores = new Jogador[4];
       // Jogador[] jogadores = new Jogador[]{j1,j2,j3,j4};
        Jogador[] jogadores = {j1, j2, j3, j4};

        for (Jogador list: jogadores
             ) {
            System.out.println(list);
        }

    }

}
