package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {

    abreConexao();





    }


    private static String abreConexao() {
        try {
            System.out.println("Abrindo Arquivo");
          System.out.println("Escrevendo dados no Arquivo");
            return "conexão aberta";
        }catch (Exception e){
                e.printStackTrace();
        }finally {
            System.out.println("Fechando o recurso liberado pelo o SO.");

    }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
        }finally {
            System.out.println("Fechando o recurso liberado pelo o SO.");

        }
    }
}
