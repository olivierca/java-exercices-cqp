package exercices;

public class Car extends Vehicle
{
    private static final int taxe = 2;

    Car(String mark, Main.Color color, float price)
    {
        this.Mark = mark;
        this.Price = price;
        this.Color = color;
    }

    protected float getPriceWithTax(){return Price+taxe;}   // taxe de 2 €
}
