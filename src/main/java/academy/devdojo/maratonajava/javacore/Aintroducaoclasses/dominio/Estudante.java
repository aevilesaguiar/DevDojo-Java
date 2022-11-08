package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Estudante {
    public String name;
    public int idade;
    public char sexo;

    @Override
    public String toString() {
        return "Estudante{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }


}
