package academy.devdojo.maratonajava.javacore.Tresourcebundle;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    //ResourceBundle (Um pacote configurável) de recursos é um arquivo Java .properties que contém dados específicos do código do idioma.
    // É uma forma de internacionalizar um aplicativo Java tornando o código independente da localidade
    //OU SEJA O JAVA pega a amensagem baseada no local

    /*
    * Isso permite que você escreva programas que podem:

    ser facilmente localizado ou traduzido para diferentes idiomas
    lidar com vários locais ao mesmo tempo
    ser facilmente modificado posteriormente para suportar ainda mais localidades*/

    public static void main(String[] args) {

        //localização do sistema Operacional
        System.out.println(Locale.getDefault());

        //para utilizar o ResorceBundle é necessario criar as mensagens num arquivo especial
        //criei dentro do source um arquivo que possui um nome base <NOMEDOARQUIVO_lingua_PAIS.properties>  eX: messages_pt_BR.properties


        ResourceBundle myResources = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        boolean sasa = myResources.containsKey("sasa");//verifica se a chave existe
        System.out.println(sasa);


    }


    }

