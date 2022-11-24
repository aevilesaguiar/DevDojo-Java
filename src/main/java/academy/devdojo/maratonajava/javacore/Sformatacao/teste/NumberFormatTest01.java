package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        //Classes Utilitárias - Internacionalização Números com Locale
        /*
        * Retorna um formato de número de uso geral para a localidade especificada.
        *Parâmetros:inLocale – a localidade desejada
        *retorna:a instância NumberFormat para formatação de número de uso geral
         */


        Locale localeDefault=Locale.getDefault();//PADRÃO DO SISTEMA OPERACIONAL
        Locale localeBR=new Locale("pt","BR");
        Locale localeJP=Locale.JAPAN;
        Locale localeCH=Locale.CHINESE;
        Locale localeIT=Locale.ITALY;

        NumberFormat[] df = new NumberFormat[5];
        df[0]=NumberFormat.getInstance(localeBR);//10.000,213
        df[1]=NumberFormat.getInstance(localeJP);//10,000.213
        df[2]=NumberFormat.getInstance(localeCH);//10,000.213
        df[3]=NumberFormat.getInstance(localeIT);//10.000,213
        df[4]=NumberFormat.getInstance();//10.000,213

        double valor = 1_000.2130;//no mundo computacional não pode usar virgula  se usa ponto

        for (NumberFormat numberFormat:df
             ) {
                //se quiser alterar de 3 digitos para 2
               numberFormat.setMaximumFractionDigits(2); //fracao dos digitos 2
            System.out.println(numberFormat.format(valor));
            //System.out.println(numberFormat.getMaximumFractionDigits()); //fracao dos digitos 3
        }

        String valorString="1000.2130";
        try {
            System.out.println(df[4].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
