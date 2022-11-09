package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estudante01= new Estudante("Ana",16,'F');
        Estudante estudante02= new Estudante("Bob",13,'M');

        ImpressoraEstudante impressoraEstudante= new ImpressoraEstudante();

        System.out.println(estudante01);
        System.out.println(estudante02);


        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);


    }
}
