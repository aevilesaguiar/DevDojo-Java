package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro: ");
        System.out.println("Digite sua perguta e eu responderei sim ou não ");
        String pergunta = sc.nextLine();
        if(pergunta.charAt(0)== ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }


        sc.close();
    }
}
