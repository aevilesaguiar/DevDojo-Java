package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String nome;


    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
