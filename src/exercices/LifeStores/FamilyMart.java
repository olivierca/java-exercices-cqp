package exercices;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.ArrayList;

public class FamilyMart implements ConvenienceStore
{
    private static final int maxProducts = 2;
    private ArrayList<Product> listProduct = new ArrayList<Product>();      // création de la liste des produits
    private int nbEmployes;                                           // nombre d'employés

    public FamilyMart(ArrayList<Product> products,int nbEmployes)
    {
        listProduct.addAll(products);
        this.nbEmployes = nbEmployes;
    }

    @Override
    public boolean sell(Product product)
    {
        if(nbEmployes>0)
        {
            for (Product i:listProduct)
            {
                if(i.getNom() == product.getNom())      // produit trouvé
                {
                    listProduct.remove(i);              // produit retiré du distributeur
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean filled()
    {
        if(listProduct.size() >= maxProducts)   return true;        // magasin plein
        else                                    return false;
    }

    @Override
    public String toString()            // contenu du magasin
    {
        String text="\r\nProduits du magasin :\r\n";
        text += "Nombre d'employés : " + nbEmployes + "\r\n";
        for (Product i:listProduct)
        {
            text += "Produit : " + i.getNom() + ", Prix : " + i.getPrix() + "\r\n";
        }
        return text;
    }

    public int getNbEmployes(){return nbEmployes;};
    public void setNbEmployes(int nbEmployes){this.nbEmployes = nbEmployes;};
}
