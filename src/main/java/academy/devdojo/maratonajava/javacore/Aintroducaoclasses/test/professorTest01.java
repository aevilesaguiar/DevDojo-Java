package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class professorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome="Fernando Silva";
        professor.sexo='M';
        professor.idade=36;

        System.out.println(professor);
    }
}
