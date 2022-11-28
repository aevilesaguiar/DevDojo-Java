package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private  Long id;
    private String nome;

    public Consumidor( String nome) {
        //this.id = ThreadLocalRandom.current().nextLong();//retorna um Long gigantesco que é dificil ver um valor duplicado. Ex: Consumidor{id=-712005786804436733, nome='William Suanne'}
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);//dessa forma ele cria valores de 0 a 100.000. Ex: Consumidor{id=92503, nome='William Suanne'}
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
