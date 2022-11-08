package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula31EstruturasDeRepeticao05 {
        //dado um valor de um carro, descubra em quantas ele pode ser parcelado
        //Condição valorDaParcela>=1000.00
    public static void main(String[] args) {

        double valueCar=30000.00;


        for (int parcela = (int)valueCar; parcela >=1; parcela--) {
            double valorParcela = valueCar/parcela;
            if(valorParcela<1000){
                continue;
            }
            System.out.println("parcela "+ parcela+ " R$ "+valorParcela);

        }

        








    }
}
