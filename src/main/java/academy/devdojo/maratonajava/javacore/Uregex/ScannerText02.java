package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.Scanner;

public class ScannerText02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        // Scanner - Tokens e Delimitadores
        Scanner scanner= new Scanner(texto);
        scanner.useDelimiter(",");//delimitador padrão do Scanner é o espaço em branco, mas posso colocar outros como no exemplo

        System.out.println("-------------------");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean j = scanner.nextBoolean();
                System.out.println("Boolean: " + j);
            } else{
                System.out.println("String: "+scanner.next());
            }

        }


        scanner.close();



    }
}
