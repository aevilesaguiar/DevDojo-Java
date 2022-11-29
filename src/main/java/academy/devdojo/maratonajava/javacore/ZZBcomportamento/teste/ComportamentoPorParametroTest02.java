package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    //lista com tres carros (um atributo de classe)
    private static List<Car> carList = List.of(new Car("Green",2022), new Car("Red",2023), new Car("Black",2018));

    public static void main(String[] args) {
        List<Car> greenCars = filter(carList, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        });

        System.out.println(greenCars);


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


    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){


        List<Car> filteredCar=new ArrayList<>();

        for (Car car : cars
        ){
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
