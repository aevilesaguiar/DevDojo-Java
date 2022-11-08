package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {


        int[] numeros= new int[3];
        int[] numeros2 = {1,2,3,4,5,6}; //inicializado direto com os valores
        int[] numeros3 = new int[]{1,2,3,4,5};
        String[] salada = new String[]{"Pera","Uva", "maçã", "mamão", "pêssego"};


        for (int i = 0; i < numeros2.length ; i++) {

            System.out.println(numeros2[i]);
        }
        System.out.println("----------------------------");

        for (int i = 0; i < numeros3.length ; i++) {

            System.out.println(numeros3[i]);
        }
        System.out.println("----------------------------");

        for (int listNumber: numeros3
             ) {
            System.out.println(listNumber);
        }
        System.out.println("---------------------------");

        for (String listSalad: salada
             ) {
            System.out.println(listSalad);
        }


    }
    }
