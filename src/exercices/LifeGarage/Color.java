package exercices;

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
