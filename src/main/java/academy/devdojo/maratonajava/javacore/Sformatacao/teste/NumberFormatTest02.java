package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        //Classes Utilitárias - Internacionalização Números com Locale


        Locale localeDefault=Locale.getDefault();//PADRÃO DO SISTEMA OPERACIONAL
        Locale localeBR=new Locale("pt","BR");
        Locale localeJP=Locale.JAPAN;
        Locale localeCH=Locale.CHINESE;
        Locale localeIT=Locale.ITALY;

        //converte o valor para o sistema monetário
        NumberFormat[] df = new NumberFormat[5];
        df[0]=NumberFormat.getCurrencyInstance(localeBR);//R$100.000.000,21
        df[1]=NumberFormat.getCurrencyInstance(localeJP);//￥100,000,000 -> Não tem valor quebrado
        df[2]=NumberFormat.getCurrencyInstance(localeCH);//¤100,000,000.21
        df[3]=NumberFormat.getCurrencyInstance(localeIT);//100.000.000,21€
        df[4]=NumberFormat.getCurrencyInstance();//R$100.000.000,21

        double valor = 1000.2130;//no mundo computacional não pode usar virgula  se usa ponto

        for (NumberFormat numberFormat:df
             ) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        //conversão de string para Moeda
    String valorString="￥1,000 ";
        try {
            System.out.println(df[1].parse(valorString).doubleValue());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
