package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula23ExercicioEstruturaCondicionaisCorrigido {
    public static void main(String[] args) {

        //0 a 34712.00 - 9,70
        //34713.00 - 68507.00 -

        double salaryYears = 70000.00;
        double primeiraFaixa=9.7/100;
        double segundaFaixa=37.50/100;
        double terceiraFaixa=49.50/100;
        double tax=0.00;

        if(salaryYears <=34712.00){
           tax=salaryYears*primeiraFaixa;

        }else if(salaryYears>=34713.00 && salaryYears<=68507.00){
          tax=salaryYears*segundaFaixa;
        }else{
            tax=salaryYears*terceiraFaixa;
        }

        System.out.println(tax);

    }
}
