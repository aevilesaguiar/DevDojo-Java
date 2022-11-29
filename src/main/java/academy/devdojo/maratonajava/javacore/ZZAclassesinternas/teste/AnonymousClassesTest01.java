package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

class Animal{
    public void anda(){
        System.out.println("Animal Anda");
    }

}


public class AnonymousClassesTest01 {

    public static void main(String[] args) {

        //quando eu incluo após o objeto {} estou criando uma classe anonima
        Animal animal= new Animal(){
            @Override
            public void anda() {
                System.out.println("Andando na sombra");

            }

        };
        animal.anda();





    }
}
