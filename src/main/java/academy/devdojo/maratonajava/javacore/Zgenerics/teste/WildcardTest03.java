package academy.devdojo.maratonajava.javacore.Zgenerics.teste;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest03
{
    public static void main(String[] args) {

        List<Cachorro> cachorros=List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos=List.of(new Gato(),new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);


        List<Animal> animals= new ArrayList<>();
        printConsulta(animals);
        printConsulta(cachorros);
        printConsulta(gatos);




    }

   //wild card (?) tipo curinga
    private static void printConsulta(List<? extends Animal> animals){//1 -quando voce aceita esse contrato quer dizer que você não pode adicionar elementos nessa lista
        for (Animal animal:animals                                    //2 - tudo que você passar dentro desse método vai ser somente leitura
             ) {                                                      //3 - não consigo adicionar nada nessa lista
            animal.consulta();
        }
        //animals.add(new Cachorro());
    }


    private static void printConsultaAnimal(List<? super Animal> animails){//POSSO PASSAR UM ANIMAL OU UM SUPER DE ANIMAL(OBJECT),não posso passar cachorro nem gato porque eles são sub

        Animal animal=new Cachorro();
        Animal animal1=new Gato();


    }

}
