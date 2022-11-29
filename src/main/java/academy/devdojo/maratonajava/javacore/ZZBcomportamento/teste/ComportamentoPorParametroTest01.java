package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    //lista com tres carros (um atributo de classe)
    private static List<Car> carList = List.of(new Car("Green",2022), new Car("Red",2023), new Car("Black",2018));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(carList));
        System.out.println(filterRedCar(carList));
        System.out.println(filterCarByColor(carList,"Black"));
        System.out.println(filterCarByColor(carList,"Red"));
        System.out.println("-----------------");
        System.out.println(filterCarByAge(carList,2022));



    }

    //filtrar carros por cor
    private static List<Car> filterGreenCar(List<Car> cars){
        
        List<Car> listgreen=new ArrayList<>();

        for (Car car : cars
        ){
            if (car.getColor().equalsIgnoreCase("green")){
                listgreen.add(car);
            }
        }
        return listgreen;
    }

    private static List<Car> filterRedCar(List<Car> cars){

        List<Car> listgreen=new ArrayList<>();

        for (Car car : cars
        ){
            if (car.getColor().equalsIgnoreCase("red")){
                listgreen.add(car);
            }
        }
        return listgreen;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){

        List<Car> filteredcarColor=new ArrayList<>();

        for (Car car : cars
        ){
            if (car.getColor().equalsIgnoreCase(color)){
                filteredcarColor.add(car);
            }
        }
        return filteredcarColor;
    }

    private static List<Car> filterCarByAge(List<Car> cars, int year){

        List<Car> oldCars=new ArrayList<>();

        for (Car car : cars
        ){
            if (car.getYear()<year){
                oldCars.add(car);
            }
        }
        return oldCars;
    }



}
