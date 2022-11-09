package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora= new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1,num2);
        calculadora.alteraDoisNumeros(3,2);
        System.out.println("Dentro calculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);


    }
}
