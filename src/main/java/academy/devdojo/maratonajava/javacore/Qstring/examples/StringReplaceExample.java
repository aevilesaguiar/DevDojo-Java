package academy.devdojo.maratonajava.javacore.Qstring.examples;

public class StringReplaceExample {
    public static void main(String[] args) {

        //replace(char oldChar,  char newChar)
        String s = "Hello World";
        s=s.replace('l','m');
        System.out.println("Substituir l por m");
        System.out.println(s);


        //replaceAll(String regex, String replacement)
        String s1 = "Hello journaldev, Hello pankaj";
        s1=s1.replaceFirst("Hello", "Hi");
        System.out.println("Depois replace");
        System.out.println(s1);

        //replaceFirst(String regex, String replacement)
        String s2 = "Hello guys, Hello world";
        s2=s2.replaceFirst("Hello","Hi");
        System.out.println("Depois do replace");
        System.out.println(s2);


    }
}
