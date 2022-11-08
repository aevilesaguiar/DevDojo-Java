package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        System.out.println(estudante.idade);
        System.out.println(estudante.name);
        System.out.println(estudante.sexo);

        estudante2.name="Mariaana";
        System.out.println(estudante2.idade);
        System.out.println(estudante2.name);
        System.out.println(estudante2.sexo);



    }
}
