package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone() {
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*
    *
        - É reflexivo: para qualquer valor de referência não nulo x, x.equals(x) deve retornar verdadeiro.
        - É simétrico: para quaisquer valores de referência não nulos x e y, x.equals(y) deve retornar verdadeiro se e
        somente se y.equals(x) retornar verdadeiro.
        - É transitivo: para quaisquer valores de referência não nulos x, y e z, se x.equals(y) retornar verdadeiro e y.equals(z)
        retornar verdadeiro, então x.equals(z) deve retornar verdadeiro.
        - É consistente: para quaisquer valores de referência não nulos xey, várias invocações de x.equals(y) consistentemente
        retornam verdadeiro ou consistentemente retornam falso, desde que nenhuma informação usada em comparações iguais nos
        objetos seja modificada.
        - Para qualquer valor de referência não nulo x, x.equals(null) deve retornar false.
* */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return serialNumber.equals(that.serialNumber) && Objects.equals(marca, that.marca);
    }

/*
* se x.equals(y) == true, y.equals() == x.hascode()
* y.hashCode () == x.hashCode() não necessariamente equals de y.equals(x) tem que ser true
* x.equals(y) ==false
* y.hashCode() != x.hashcode() x.equals(y) deverá ser false*/

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, marca);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
