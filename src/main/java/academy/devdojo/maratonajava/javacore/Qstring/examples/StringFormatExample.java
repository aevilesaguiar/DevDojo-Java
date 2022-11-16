package academy.devdojo.maratonajava.javacore.Qstring.examples;

import java.util.Locale;

public class StringFormatExample {
    public static void main(String[] args) {

        String s = "journaldev.com";
        // %s is used to append the string
        System.out.println(String.format("This is %s", s));

        //using locale as Locale.US
        System.out.println(String.format(Locale.US, "%.2f", 3.14));


    }
}
