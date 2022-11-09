package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite M ou F para o seu Sexo");
        char sexo = scanner.next().charAt(0);

        System.out.println("Nome: "+nome+ "\nIdade: "+idade +"\nSexo: "+sexo);




        scanner.close();

    }
}
