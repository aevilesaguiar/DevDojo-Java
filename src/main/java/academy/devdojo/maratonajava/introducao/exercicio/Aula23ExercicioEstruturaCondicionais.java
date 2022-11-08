package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula23ExercicioEstruturaCondicionais {
    public static void main(String[] args) {

        //0 a 34712.00 - 9,70
        //34713.00 - 68507.00 -

        double salary = 35000.00;
        double tax=0.00;

        if(salary <=34712.00){
            tax=salary*0.097;

        }else if(salary<=68507.00){
            tax=salary*37.35/100;
        }else{
            tax=salary*49.50/100;
        }

        System.out.println(tax);

    }
}
