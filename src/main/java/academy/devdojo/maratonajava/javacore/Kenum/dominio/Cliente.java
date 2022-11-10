package academy.devdojo.maratonajava.javacore.Kenum.dominio;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.enums.TipoCliente;

public class Cliente {

    public enum TipoPagamento{
        DEBITO,CREDITO;
    }
    private String nome;

    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente="+tipoCliente.getValor()+
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}