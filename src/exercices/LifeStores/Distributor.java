package exercices;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import java.util.ArrayList;

public class Distributor implements ConvenienceStore
{
    private static final int maxProducts = 5;

    private ArrayList<Product> listProduct = new ArrayList<Product>();  // création de la liste des produits

    public Distributor(ArrayList<Product> products)
    {
        listProduct.addAll(products);
    }

    @Override
    public boolean sell(Product product)
    {
        for (Product i:listProduct)
        {
            if(i.getNom() == product.getNom())      // produit trouvé
            {
                listProduct.remove(i);              // produit retiré du distributeur
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean filled()
    {
        if(listProduct.size() >= maxProducts)   return true;    // distributeur plein
        else                                    return false;
    }

    @Override
    public String toString()        // contenu du distributeur
    {
        String text = "\r\nProduits du distributeur :\r\n";
        for (Product i:listProduct)
        {
            text += "Produit : " + i.getNom() + ", Prix : " + i.getPrix() + "\r\n";
        }
        return text;
    }
}
