package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

//carrega dados do BD
public class DatabaseLoader  implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");

    }


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na Dtabase Loader");
    }
}
