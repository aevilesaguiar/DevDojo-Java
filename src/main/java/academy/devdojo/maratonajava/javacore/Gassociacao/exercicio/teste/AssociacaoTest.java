package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Local local1 = new Local("Alameda Santos, 251, centro, Santos-SP");
        Local local2 = new Local("Avenida Faria Lima, 21, centro, São Paulo-SP");
        Local local3 = new Local("Rua Itamar Franco, 1, centro, Piracicaba-SP");

        Aluno a1 = new Aluno("FRancisco Dias",39);
        Aluno a2 = new Aluno("Daniela Marques",28);
        Aluno a3 = new Aluno("Enzo Souza",35);
        Aluno a4 = new Aluno("Mariza Tavares",29);

        Aluno[] list1 = {a1,a2};
        Aluno[] list2 = {a3};
        Aluno[] list3 = {a4};

        Professor p1= new Professor("Flávio Tavares", "Mestre");
        Professor p2= new Professor("Inez Silva", "Doutora");
        Professor p3= new Professor("Sueli Silva", "Mestre");

        Seminario s1 = new Seminario("Filosofia Aplicada",list1,local1);
        Seminario s2 = new Seminario("Dados ",list2,local2);
        Seminario s3 = new Seminario("História do Brasil",list3,local3);
        Seminario s4 = new Seminario("Psicologia",null,local1);

        Seminario[] seminariosDisponiveis1={s1,s3,};
        Seminario[] seminariosDisponiveis2={s2};
        Seminario[] seminariosDisponiveis3={s4};

        p1.setSeminarios(seminariosDisponiveis1);
        p2.setSeminarios(seminariosDisponiveis2);
        p3.setSeminarios(seminariosDisponiveis3);


        p1.imprime();

        p2.imprime();

        p3.imprime();








    }
}
