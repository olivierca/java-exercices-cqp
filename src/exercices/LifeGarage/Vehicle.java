package exercices;

abstract class Vehicle
{
    protected String      Mark;
    protected Main.Color  Color;
    protected float       Price;

    public String toString()
    {
        return Mark + ", " + Color + ", " + getPriceWithTax() + "\r\n";
    }

    abstract float getPriceWithTax();
}
