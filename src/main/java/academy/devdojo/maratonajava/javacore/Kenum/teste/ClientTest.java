package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.enums.TipoCliente;

public class ClientTest {
    public static void main(String[] args) {

        Cliente cliente= new Cliente("Firmino", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente2= new Cliente("Firmino",TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
    }
}
