package exercices;

public class Product
{
    private String nomProduct;
    private float prixProduct;

    public Product(String nom, float prix)
    {
        nomProduct = nom;
        prixProduct = prix;
    }

    public String getNom(){return nomProduct;}
    public float getPrix(){return prixProduct;}
}
