package academy.devdojo.maratonajava.javacore.Zgenerics.teste;


import java.util.List;

public class WildcardTest02
{
    public static void main(String[] args) {

        List<Cachorro> cachorros=List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos=List.of(new Gato(),new Gato());




    }

    /*O que é apagamento de tipo(Tipo erasure)? O apagamento de tipo pode ser explicado como o processo de impor restrições de tipo
    somente em tempo de compilação e descartar as informações de tipo de elemento em tempo de execução . Portanto,
    o compilador garante a segurança de tipo do nosso código e evita erros de tempo de execução.*/
    private static void printConsulta(List<Animal> animals){
        for (Animal animal:animals
             ) {
            animal.consulta();
        }
        animals.add(new Cachorro());


    }

}
