package academy.devdojo.maratonajava.javacore.Qstring.examples;

public class StringCompareToExample {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "def";
        String s4 = "ABC";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareToIgnoreCase(s4));
    }
}
