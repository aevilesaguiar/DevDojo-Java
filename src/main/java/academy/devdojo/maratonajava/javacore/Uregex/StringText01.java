package academy.devdojo.maratonajava.javacore.Uregex;

public class StringText01 {
    public static void main(String[] args) {

        // Scanner - Tokens e Delimitadores

        String texto = "Levi, Eren, Mikasa, true, 200 ";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }




        String text="Era uma vez um lugarzinho no meio do nada";
        String[] s = text.split(" ");
        for (String music: s
             ) {
            System.out.println(music);
        }

       String text2="Tu e eu, somos um povo, tu e eu preparados, para mostrar, as grandezas do Senhor";
        String[] split = text2.split(",");
        for (String s1 : split) {
            System.out.println(s1.trim());
        }




    }
}
