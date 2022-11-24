package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

//a regra do do java é posso ter quantas classes eu quiser dentro de um arquivo,
//sendo que a classe tem que ser publica, batendo com o nome do arquivo
class ObterProximoDiaUtil implements TemporalAdjuster{
    //sexta-sabado-domingo são considerados dia de semana, dado uma determinada data
    //você tem que retornar o proximo dia útil
    //Ex:Se der segunda tenho que retorna terça, se for terça retorno quarta, se der quinta retorno segunda
    //não existe método nativo no Temporal Adjuster
    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays=1;
        switch (dayOfWeek){

            case THURSDAY:addDays=4;break;
            case FRIDAY:addDays=3;break;
            case SATURDAY:addDays=2;break;
            default:addDays=1;

        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjustersTest01 {
    //TemporalAdjusters é uma interface, ela só tem um método
    //é uma classe utilitária, essa classe foi feita para fazer ajustes no tempo

    public static void main(String[] args) {

        LocalDate now=LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now=LocalDate.now().withDayOfMonth(26).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
