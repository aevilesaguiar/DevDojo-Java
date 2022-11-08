package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula26EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //considerando 1 como domindo

        int dia=10;

        switch (dia){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia últil");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }



    }
}
