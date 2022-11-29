package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

public class MetodoGenericoTest02 {
    public static void main(String[] args) {
        new DoisAtributos<Cachorro,Gato, Carro>();
    }

}

class  DoisAtributos<T,X,I>{
    private T t;
    private X x;
    private I i;

}


