package exercices;

import java.util.ArrayList;

public class Main {

    public enum Color {
        RED("Rouge",0xFFFF00),
        GREEN("Vert",0x008000),
        BLUE("Bleu",0x0000FF);

        private final String color;
        private final int val;

        Color(String color,int val)
        {
            this.color = color;
            this.val = val;
        }

        public int valueof(String color)
        {
            return val;
        }

        @Override
        public String toString() {return color;}
    }

    public static void main(String[] args)
    {

        Garage garage = new Garage();                           // creation du garage
        garage.addCar(new Car("Renault", Color.RED, 999.9f));  // Ajouter une voiture au garage

        System.out.println("Affiche les infos de la voiture");
        System.out.println("-------------------------------");
        System.out.println(garage);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("peugeot",Color.GREEN, 1000));
        cars.add(new Car("volkswagen",Color.BLUE, 1500));
        cars.add(new Car("renault",Color.RED, 2000.5f));
        garage.addCar(cars);                                // ajouter une liste de 3 voitures

        System.out.println("Affiche les infos de toutes les voitures");
        System.out.println("----------------------------------------");
        System.out.println(garage);

        // abstraction
        //---------------------------------------------------------------------------------------------

        ArrayList<Bike> bikes = new ArrayList<Bike>();
        bikes.add(new Bike("harley", Color.RED, 800));
        bikes.add(new Bike("ducati", Color.BLUE, 1000));
        bikes.add(new Bike("bmw", Color.GREEN, 1999.9f));
        garage.addBike(bikes);                                // ajouter une liste de 3 motos

        System.out.println("Affiche les infos de toutes les véhicules");
        System.out.println("-----------------------------------------");
        System.out.println(garage);

    }
}

