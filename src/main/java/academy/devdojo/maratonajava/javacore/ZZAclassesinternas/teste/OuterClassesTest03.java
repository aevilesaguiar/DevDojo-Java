package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

//classes staticas aninhadas
public class OuterClassesTest03 {

    private String name="Flavio";

    static class Nested{
        private String lastName="Tavares";
        void print(){
            System.out.println(new OuterClassesTest03().name+ " "+lastName);
        }

    }


    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
