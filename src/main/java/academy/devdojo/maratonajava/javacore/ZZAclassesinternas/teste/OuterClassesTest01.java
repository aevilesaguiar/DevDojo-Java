package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

//classe de fora
public class OuterClassesTest01 {
    private String name= "João da Silva";

    //classe de dentro
    class Inner{
        //essa classe eu posso criar atributos/métodos/pode acessar os métodos que estão externamente


        public void printOuterClassAttributte(){
            System.out.println(name);
            //this sempre se refere ao contexto da classe que eel se encontra
            System.out.println(this);//OuterClassesTest01$Inner@65ab7765 -> ($Inner@65ab7765) =$representa o que vem depois da classe interna, ou seja está referenciando a classe interna
            System.out.println(OuterClassesTest01.this);//this da classe mais extrna ->OuterClassesTest01@1b28cdfa
        }
    }
    public static void main(String[] args) {
//Inner Class é basicametne uma classe dentro da outra.


        OuterClassesTest01 outerClas=new OuterClassesTest01();
        Inner inner = outerClas.new Inner();//Do Objeto da classe de fora, eu quero criar um novo objeto da classe de dentro
        //outra forma de criar um Objeto
        OuterClassesTest01.Inner inner1=outerClas.new Inner();//você referencia completamente o caminho da InnerClass

        inner.printOuterClassAttributte();

        //outra forma de criar um Objeto
        Inner inner2 = new OuterClassesTest01().new Inner();



    }
}
