package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //dado um numero de 1 -50 imprima os primeiro 25 numeros
        //depois parasse de executar o laço de repetição

        int valorMax = 50;

        for (int i = 0; i <valorMax ; i++) {
            if(i>25){
                break;
            }
            System.out.println("i= "+i);

        }

    }
}
