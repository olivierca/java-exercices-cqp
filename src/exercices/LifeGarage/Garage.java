package exercices;

import java.util.ArrayList;

public class Garage
{
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();    // création de la liste des véhicules

    public void addCar(Car car)             // Ajoute une voiture
    {
        vehicles.add(car);
    }

    public void addCar(ArrayList<Car> cars)  // Ajoute une liste de voitures
    {
        vehicles.addAll(cars);
    }

    public void addBike(Bike bike)               // Ajoute une moto
    {
        vehicles.add(bike);
    }

    public void addBike(ArrayList<Bike> bikes)   // Ajoute une liste de motos
    {
        vehicles.addAll(bikes);
    }

    @Override
    public String toString()
    {
        String Text="marque, couleur, prix\r\n";
        for (Vehicle i: vehicles)
        {
            Text += i.toString();
        }
        return Text;
    }
}
