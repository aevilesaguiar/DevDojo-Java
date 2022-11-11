package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Analistas extends Funcionario{
    public Analistas(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {

    }

    @Override
    public String toString() {
        return "Analistas{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
