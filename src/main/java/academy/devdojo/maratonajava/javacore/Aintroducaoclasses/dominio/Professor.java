package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Professor {

    public String nome;
    public int idade;
    public char sexo;

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
