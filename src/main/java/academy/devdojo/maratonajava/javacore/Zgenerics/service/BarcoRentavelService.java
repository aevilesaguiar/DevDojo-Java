package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {

    private List<Barco> barcosDisponiveis= new ArrayList<>(List.of(new Barco("Iate"),new Barco("Canoa")));//simulando um BD

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel...");
        Barco barco=barcosDisponiveis.remove(0);//remove a primeira posição
        System.out.println("Alugando barco: "+barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;


    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco..."+barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barco disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);

    }


}
