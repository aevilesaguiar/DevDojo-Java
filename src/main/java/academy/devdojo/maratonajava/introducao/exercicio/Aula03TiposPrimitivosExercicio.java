package academy.devdojo.maratonajava.introducao.exercicio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPadrao = LocalDate.of(2022,11,07);

        /*Prática
        * Crie variáveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem
        *
        * Eu <nome> , morando no endereço <endereco>,
        * confirmo que recebi o salário de <salario>, na data <data>*/

        double salary = 5000.00D;
        String name = "Ana";
        String endereco = "Rua Maria da Silva,01 , Serraria, Piracicaba - SP";
        String data = dataPadrao.format(formatter);

        System.out.println("Eu "+name+" , morando no endereço "+endereco
                +",\n confirmo que recebi o salário de R$"+salary+", na data do dia "+data+".");





    }
}
