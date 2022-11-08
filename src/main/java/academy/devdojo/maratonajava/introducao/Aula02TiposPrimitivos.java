package academy.devdojo.maratonajava.introducao;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int age=32;
        System.out.println(age);

        String name = "Ana Maria";
        System.out.println(name);

        double salaryDouble = 2000.0D;
        float salaryFloar = 2500.00F;
        byte idadeByte = 10;
        //byte idadeByte2 = 128;
        short idadeShort = 32000;
        boolean verdadeiro= true;
        boolean falso = false;
        char characterGender = 'M';
        char caractere='\u0041';
        int age2=(int)10000000000L;
        String endereco = "Rua Maria da Silva";
        var dados = endereco;

        System.out.println(caractere);
        System.out.println(age2); //após forçar não coube então ele corta os bits, pois ele força a entrada de valores
        System.out.println(endereco);
        System.out.println(dados);






    }
}
