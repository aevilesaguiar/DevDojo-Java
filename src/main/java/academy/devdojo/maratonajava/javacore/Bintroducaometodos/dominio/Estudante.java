package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String name;
    public int idade;
    public char sexo;

    public Estudante(String name, int idade, char sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }


    public void imprime(){
        System.out.println("-----------------------------------");
        System.out.println(this.name);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }


}
