package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //byte, short,int, long, float e double =0
        //char '\u0000' =' '
        //boolean false
        //String null

        String[] nomes = new String[3];
       nomes[0]="Mary";
       nomes[1]="Bob";
       nomes[2]="Fred";



        for (int i = 0; i <nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("--------------------------------");

        nomes=new String[8];
        nomes[0]="Mariana";
        nomes[1]="Roberto";
        nomes[2]="Frederico";


        for (int i = 0; i <nomes.length ; i++) {
            System.out.println(nomes[i]);
        }



    }
    }
