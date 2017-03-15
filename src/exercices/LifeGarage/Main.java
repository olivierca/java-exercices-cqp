package exercices;

import java.util.ArrayList;

import static exercices.Color.*;

public class Main {

    public static void main(String[] args)
    {

        Garage garage = new Garage();                           // creation du garage
        garage.addCar(new Car("Renault", RED, 999.9f));  // Ajouter une voiture au garage

        System.out.println("Affiche les infos de la voiture");
        System.out.println("-------------------------------");
        System.out.println(garage);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("peugeot", GREEN, 1000));
        cars.add(new Car("volkswagen", BLUE, 1500));
        cars.add(new Car("renault", RED, 2000.5f));
        garage.addCar(cars);                                // ajouter une liste de 3 voitures

        System.out.println("Affiche les infos de toutes les voitures");
        System.out.println("----------------------------------------");
        System.out.println(garage);

        // abstraction
        //---------------------------------------------------------------------------------------------

        ArrayList<Bike> bikes = new ArrayList<Bike>();
        bikes.add(new Bike("harley", RED, 800));
        bikes.add(new Bike("ducati", BLUE, 1000));
        bikes.add(new Bike("bmw", GREEN, 1999.9f));
        garage.addBike(bikes);                                // ajouter une liste de 3 motos

        System.out.println("Affiche les infos de toutes les véhicules");
        System.out.println("-----------------------------------------");
        System.out.println(garage);

    }
}

