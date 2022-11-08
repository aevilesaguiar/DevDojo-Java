package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula28EstruturasDeRepeticaoExercicioFor {
    public static void main(String[] args) {
        //imprimi numeros pares de 0 até 1.000.000

        int limite=10;

        for (int i = 0; i <=limite ; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
        System.out.println("----------------------------------");

        int count=0;

        while(count<=10){
            if(count%2==0){
                System.out.println(count);
            }
            count++;
        }

        System.out.println("---------------------------------");
        //forma não indicada

        for (int i = 0; i <=10 ; i+=2) {
            System.out.println(i);
        }




    }
}
