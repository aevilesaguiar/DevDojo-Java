package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome ="Willian";//String constant pool
        String nome2 ="Willian";

        System.out.println(nome.equals(nome2));

        //comparar referencia
        System.out.println(nome==nome2);//fazem referencia ao mesmo objeto de memória

        nome.concat(" Suane");
        System.out.println(nome);

         nome=nome.concat(" Suane");
        System.out.println(nome);
        //não é interessante ciar string dessa forma com new
        String nome3 = new String("Willian");//1-criando uma variavel de referencia, 2- objetos do tipo string , 3- -uma string no pool de string
        System.out.println(nome2==nome3);
        System.out.println(nome==nome3);


    }
}
