package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga mangas = (Manga) o;
        return Double.compare(mangas.preco, preco) == 0 && id.equals(mangas.id) && nome.equals(mangas.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    //é necessário para fazer a ordenação de Objetos, pois diferente do String não possui um método nativo
    @Override
    public int compareTo(Manga outroManga) {
        //retorna negativo se o this< outroManga
        //se this== outroManga, return 0
        //positivo se o this > que o outroManga
        /*if(this.id< outroManga.getId()){
            return -1;
        }else if(this.id.equals(outroManga.getId())){
            return 0;
        }else{
            return 1;
        }*/

        //como uso uma classe Wrapper eu posso delegar a responsabilidade para ele
        //se eu usar tipo primitivo eu não consigo usar uma classe dessa forma
        //para usar um tipo primitivo eu faria dessa forma
        //comparar por valor
      // return Double.compare(preco,outroManga.getPreco());
        //comparar por id
        //return this.id.compareTo(outroManga.getId());
        //ordem alfabética
        return this.nome.compareTo(outroManga.getNome());



    }
}
