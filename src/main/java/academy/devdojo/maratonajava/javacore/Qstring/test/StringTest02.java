package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome ="  Flávio";
        //CharAt() retorna o char baseado no indice , e ele começa no 0
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("á","ú"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        String numeros = "123456";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(2,5));//o indice que está terminando é sempre o indice final -1
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());//remove os valores em branco no inicio e fim


    }
}
