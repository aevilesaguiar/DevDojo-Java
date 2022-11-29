package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

//classe de fora
public class OuterClassesTest02 {
    private String name= "João";


    //Local Classes-> é quando você tem uma classe dentro de um método
    void print(final String parametro){

        //atributos também só podem usar os modificadores de acesso final
        final String lastName="Silva";

        //as classes dentro dos métodos  só podemos usar dois modificadores de acesso abastracts ou final

        class LocalClass{
            public void printLocal(){
                System.out.println(parametro);
                System.out.println(name+" da "+lastName);
            }

        }
        LocalClass localClass=new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
//Inner Class é basicametne uma classe dentro da outra.


        OuterClassesTest02 outerClas=new OuterClassesTest02();






    }
}
