package academy.devdojo.maratonajava.javacore.Kenum.dominio.enums;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;
     TipoCliente(int valor, String nomeRelatorio) {
         this.valor =valor;
         this.nomeRelatorio=nomeRelatorio;
    }



    //values retorna um array de todos os tipos clientes(de todas as enumerações)
   public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
       for (TipoCliente tipoCliente: values()) {
           if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
               return tipoCliente;
           }

       }
       return null;
  }


    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
