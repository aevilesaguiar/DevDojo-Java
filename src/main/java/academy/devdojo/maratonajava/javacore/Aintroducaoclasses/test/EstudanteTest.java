package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.name="Maria da Silva";
        estudante.idade=15;
        estudante.sexo='F';

        Estudante estudante2= new Estudante();
        estudante2.name="João da Silva";
        estudante2.idade=13;
        estudante2.sexo='M';

        System.out.println(estudante);
        System.out.println(estudante2);

    }
}
