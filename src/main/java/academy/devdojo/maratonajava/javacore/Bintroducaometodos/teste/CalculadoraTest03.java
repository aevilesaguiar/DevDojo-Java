package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros02(0,15);

        System.out.println(result);

        double result2 = calculadora.divideDoisNumeros03(3,8);

        System.out.println(result2);
        System.out.println("-----------------------------");

        calculadora.imprimiDivisaoDeDoisNumeros(1,0);

    }
}
