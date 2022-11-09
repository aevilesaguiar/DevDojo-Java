package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {

    public static void main(String[] args) {
        Estudante estudante01= new Estudante("Ana",16,'F');
        Estudante estudante02= new Estudante("Bob",13,'M');

        estudante01.imprime();
        estudante02.imprime();

    }
}
