package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {

    public String nome;
    public String modelo;
    public Integer ano;

    public Carro() {
    }

    public Carro(String nome, String modelo, Integer ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
