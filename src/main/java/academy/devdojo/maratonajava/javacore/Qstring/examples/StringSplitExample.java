package academy.devdojo.maratonajava.javacore.Qstring.examples;

public class StringSplitExample {
    public static void main(String[] args) {

       String s = "a/b/c/d/e";
       String[] a1 = s.split("/");

        for (String str:a1
             ) {
            System.out.println(str);
        }

        System.out.println( "Usando regex com limit");

        String[] a2=s.split("/",3);
        for (String str:a2
             ) {
            System.out.println(str);
        }
    }
}
