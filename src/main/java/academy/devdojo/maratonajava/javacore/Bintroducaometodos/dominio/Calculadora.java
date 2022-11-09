package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void soma(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(100-10);
    }

    public void multiplicaDoisNumeros(int num1, int num2){//parâmetro
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros( double num1, double num2){
        if(num2==0 ){
            return 0;
        }

        return num1/num2;
    }

    public double divideDoisNumeros02( double num1, double num2){
        if(num2==0 ){
            return 0;
        }else {

            return num1 / num2;
        }
    }

    public double divideDoisNumeros03( double num1, double num2){
        if(num2 != 0 ){
            return num1 / num2;
        }
        System.out.println("Não existe divisão por zero!");

            return 0;

    }

    public void imprimiDivisaoDeDoisNumeros( double num1, double num2){
       if(num2==0){
           System.out.println("Não existe divisão por zero!");
           return;//é tipo um break para métodos void
       }
        System.out.println(num1/num2);

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1=99;
        num2=33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somaArray(int[] numeros){
        int soma=0;
        for (int num:numeros
             ) {
            soma+=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros){ //var args ->int...numeros o que o java faz é transformar essses numeros num array
        int soma=0;
        for (int num:numeros
        ) {
            soma+=num;
        }
        System.out.println(soma);
    }

}
