package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {


        Professor professor1 =new Professor("Fernando Henrique");
        Professor professor2 =new Professor("Maria Inez");

        Professor[] professors={professor1,professor2};
        Escola escola1 = new Escola("EE Maria da Silva",professors);


        escola1.imprime();

        System.out.println(escola1);






    }
}
