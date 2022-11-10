package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest02 {

//0. O bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
//1. Bloco de inicilização estatico da sub classe é executado quando a JVM carregar classe filha
//2. Alocado espaço em memória para o objeto da classe pai
//3. Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
//4. Bloco de inicialização da super Classe é executado na ordem em que aparece
//5. Construtor da super classe é executado é executado
//6. Alocado espaço da memória pro objeto da subclasse
//7. Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
//8. Bloco de inicialização da sub Classe é executado na ordem em que aparece
//9. Construtor da super classe é executado da subclasse

    public static void main(String[] args) {

        Funcionario funcionario= new Funcionario("João Pedro");


    }
}
