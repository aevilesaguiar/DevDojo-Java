package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private String nome;
    public final static double VELOCIDADELIMITE = 250;

    public final void imprime(){
        System.out.println(this.nome);
    }
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
