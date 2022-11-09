package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(0,15);

        System.out.println(result);

    }
}
