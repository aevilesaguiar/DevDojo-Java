package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //Date não permitia trabalhar com internacionalização de datas
        //classe quase 100% depreciada
        //date usada em sistemas legados
        //conta o tempo a partir de milisegundo
        Date date = new Date(1_000_000_000_000L); // dentro dele tem um long 100000 em milisegundos de 1970

        System.out.println(date);
        System.out.println("milisegundos: "+date.getTime());

        Date date1=new Date();//dia de hoje
        System.out.println("milisegundos da data de hoje: "+date1.getTime());//1669226252552L
        //representando a data de joje
        Date date2=new Date(1669226252552L);
        System.out.println("Data de hoje: "+date2);
        date2.setTime(date2.getTime()+3_600_00);


    }
}
