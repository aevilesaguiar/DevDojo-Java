package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        //imprima o dia da semana considerando 1 como domingo

       byte dia= 8;
/*
       if(dia ==1){
           System.out.println("Domingo");
       } else if (dia==2) {
           System.out.println("Segunda-feira");
       } else if (dia==3) {
           System.out.println("Terça-feira");
       } else if (dia==4) {
           System.out.println("quarta-feira");
       } else if (dia==5) {
           System.out.println("quinta-feira");
       } else if (dia==6) {
           System.out.println("sexta-feira");
       } else if (dia==7) {
           System.out.println("sabado");
       }
*/

       switch (dia){
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Segunda-feira");
               break;
           case 3:
               System.out.println("Terça-feira");
               break;
           case 4:
               System.out.println("quarta-feira");
               break;
           case 5:
               System.out.println("quinta-feira");
               break;
           case 6:
               System.out.println("sexta-feira");
               break;
           case 7:
               System.out.println("sabado");
               break;

           default:
               System.out.println("Opção Inválida");
       }

       char gender ='M';

       switch (gender){
           case 'M' :
               System.out.println("Masculino");
               break;
           case 'F' :
               System.out.println("Feminino");
               break;
           default:
               System.out.println("Opção Inválida");
               break;
       }

    }
}
