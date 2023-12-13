import java.util.Scanner;

public class Achat {
    static Article[] supermarche = new Article[4];

    public static void main(String[] args) {
        // Fill the supermarket array
        supermarche[0] = new Vetement(123, "Jupe bleue taille S", 39.000f, 2, "Bleue", "S");
        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantalon noir taille M", 42.000f, 5, "Noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.410f, 18);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("donner le stock a achete : ");
            int a = s.nextInt();
            if (supermarche[i].estDispo(a)) {
                System.out.println("Stock dispo");
            } else {
                System.out.println("Stock non dispo");
                supermarche[i].approvisionner(10);
            }
        }
        float totalAmount = 0.0f;
        for (int i = 0; i < 4; i++) {
            if (supermarche[i] instanceof ProduitGC) {
                supermarche[i].decrire();
                System.out.println("\n le prix de " + supermarche[i].getLibelle() + " = " + supermarche[i].calculPrixTTC());
                System.out.println("\n ***********************************************");
                totalAmount += supermarche[i].calculPrixTTC();
            } else if (supermarche[i] instanceof Vetement) {
                supermarche[i].decrire();
                System.out.println("\n le prix de " + supermarche[i].getLibelle() + " = " + ((Vetement) supermarche[i]).prixDeVente("21/03/2023"));
                System.out.println("\n ***********************************************");
                totalAmount += ((Vetement) supermarche[i]).prixDeVente("21/03/2023");
            } else {
                supermarche[i].decrire();
                System.out.println("\n le prix de " + supermarche[i].getLibelle() + " = " + ((ProduitElec) supermarche[i]).prixDeVente("21/03/2023"));
                System.out.println("\n ***********************************************");
                totalAmount += ((ProduitElec) supermarche[i]).prixDeVente("21/03/2023");

            }
        }
        System.out.println("\nMontant total: " + totalAmount);
    }
}
