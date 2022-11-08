package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        //Duas variaveis de referencia carro1 e carro2
        Carro carro1 = new Carro("Celta","Hatch",2010);
        Carro carro2 = new Carro("Yaris","Sedã",2022);

        System.out.println(carro1);
        System.out.println(carro2);

        carro1=carro2;
        System.out.println(carro1);
        System.out.println(carro2);

    }
}
