package exercices;

public class Bike extends Vehicle
{
    private static final int taxe = 1;

    Bike(String mark, Color color, float price)
    {
        this.Mark = mark;
        this.Price = price;
        this.Color = color;
    }

    protected float getPriceWithTax(){return Price+taxe;}     // taxe de 1 €
}
