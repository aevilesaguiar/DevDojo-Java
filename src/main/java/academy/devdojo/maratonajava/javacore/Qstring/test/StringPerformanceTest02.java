package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest02 {
    public static void main(String[] args) {

        //tudo que faço no string BUILDER EU FAÇO NO STRING BUFFER
      String nome = "Flavio Tavares";
        System.out.println(nome.concat(" Esposo"));
        System.out.println(nome);
        System.out.println(nome.substring(3));

        StringBuilder sb = new StringBuilder("Flavio Tavares");
        System.out.println(sb.append(" Desenvolvedor, ").append(" idade 39,"));
        System.out.println(sb.substring(0,6));

        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,3));



    }
}
