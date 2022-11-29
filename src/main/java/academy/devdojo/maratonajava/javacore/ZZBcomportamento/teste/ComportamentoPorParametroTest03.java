package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    //Classe utilizando o Predicate Nativo do Java
    // Predicate é uma interface funcional, que aceita um argumento e retorna um booleano. Normalmente, era aplicado em um filtro para uma coleção de objetos.
    private static List<Car> carList = List.of(new Car("Green",2022), new Car("Red",2023), new Car("Black",2018));

    public static void main(String[] args) {

        //Podemos fazer com lambda para ter um código mais enxuto
        List<Car> greenCars2=filter(carList,car ->car.getColor().equalsIgnoreCase("green") );
        System.out.println(greenCars2);

        List<Car> redCars2=filter(carList,car ->car.getColor().equalsIgnoreCase("red") );
        System.out.println(redCars2);

        List<Car> blackCars2=filter(carList,car ->car.getColor().equalsIgnoreCase("black") );
        System.out.println(blackCars2);

        System.out.println("----------filtrar por ano----------------");

        List<Car> filterAge = filter(carList,car -> car.getYear()>2019);
        System.out.println(filterAge);


        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println("----filtrar Par---------");
        List<Integer> filterpar = filter(nums, num -> num % 2 == 0);
        System.out.println(filterpar);

        System.out.println("----filtrar ímpar---------");
        List<Integer>filterimpar = filter(nums,num->num%2==1);
        System.out.println(filterimpar);

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){

        List<T> filteresList= new ArrayList<>();
        for (T e:list
             ) {
            if (predicate.test(e)){
                filteresList.add(e);
            }

        }

        return filteresList;
    }
}
