package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Time {

    private String nome;

    private Jogador[] jogadors;

    public void imprime(){
        System.out.println(this.nome);
        if (jogadors==null){
            return;
        }
        for (Jogador jogador: jogadors){
            System.out.println(jogador.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadors() {
        return jogadors;
    }

    public void setJogadors(Jogador[] jogadors) {
        this.jogadors = jogadors;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", jogadors=" + Arrays.toString(jogadors) +
                '}';
    }
}
