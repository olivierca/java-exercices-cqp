package exercices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Product> listProducts = new ArrayList<Product>();    // Liste des produits

        // lecture de la liste des produits depuis un fichier (Products.csv)
        // aquarius,coca,kitkat,pocky,evian,
        try {
            String ligne,nom ;
            float prix;
            BufferedReader fichier = new BufferedReader(new FileReader("Products.csv"));

            while ((ligne = fichier.readLine()) != null) {
                nom = ligne.substring(0,ligne.indexOf(","));        // nom du produit
                prix = Float.parseFloat((ligne.substring(ligne.indexOf(",")+1,ligne.length())));    // prix
                listProducts.add(new Product(nom,prix));            // ajoute le produit à la liste
            }

            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Création du distributeur
        ConvenienceStore distributor = new Distributor(listProducts);

        // le distributeur vend l'aquarius
        if(distributor.sell(listProducts.get(0)))   System.out.println("Le distributeur a vendu l'aquarius");
        else                                        System.out.println("Le distributeur n'a pas vendu l'aquarius");

        // vérifie si le distributeur est rempli
        if(distributor.filled())                    System.out.println("Le distributeur est rempli");
        else                                        System.out.println("Le distributeur n'est pas rempli");

        // affiche le contenu du distributeur
        System.out.println(distributor);

        // Creation du magasin
        ConvenienceStore familyMart = new FamilyMart(listProducts,1);

        // vérifie si le magasin est rempli
        if(familyMart.filled())                     System.out.println("Le magasin est rempli");
        else                                        System.out.println("Le magasin n'est pas rempli");

        // le magasin vend le poky
        if(familyMart.sell(listProducts.get(3)))   System.out.println("Le magasin a vendus le poky");
        else                                       System.out.println("Le magasin n'a pas vendu le poky");

        // il est 23h l'employé rentre chez lui
        ((FamilyMart) familyMart).setNbEmployes(0);

        // le magasin vend l'evian
        if(familyMart.sell(listProducts.get(4)))   System.out.println("Le magasin a vendu l'evian");
        else                                       System.out.println("Le magasin n'a pas vendu l'evian");

        // affiche le contenu du magasin
        System.out.println(familyMart);
    }
}
