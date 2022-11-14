package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeTest02 {
    public static void main(String[] args) {


            divisao(1,0);

    }

    /*
    * @param a
    * @param b não pode ser zero
    * @return
    * @throws IllegalArgumentsException caso b seja zero
    * */
    private static int divisao(int a, int b) throws  IllegalArgumentException{
        if(b==0){
            throw  new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }

            return a/b;

    }
}
