package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.LogininvalidoException;

import java.util.Scanner;

public class LoginIvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LogininvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LogininvalidoException{

        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB="ssj";

        System.out.println("Usuario");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String passwordDigitado = scanner.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(passwordDigitado)){
            throw  new LogininvalidoException("Usuario ou senha inválido");
        }

        System.out.println("Usuario logado com sucesso!");
        scanner.close();


    }
}
