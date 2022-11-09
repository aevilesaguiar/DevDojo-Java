package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {

        Calculadora calculadora= new Calculadora();
        int[] numeros={1,2,3,4,5};
       calculadora.somaArray(numeros);
        System.out.println("----------------------");
       calculadora.somaArray(new int[]{1,3,6,9});
        System.out.println("----------------------");
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,6,9,15,5);//posso passar vários argumentos diretamente


    }
}
