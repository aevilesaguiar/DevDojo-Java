package academy.devdojo.maratonajava.javacore.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste2 {

    //como criar resource bundle utilizando a própria classe
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

    }
}
