package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.util.Locale;

public class LocalTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLinguagem:isoLanguages
             ) {
            System.out.print(isoLinguagem+" ");
        }
        System.out.println();

        for (String isoPais:isoCountries
             ) {
            System.out.print(isoPais+" ");
        }
    }
}
