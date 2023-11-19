public class Achat {
    static Article[] supermarche = new Article[4];

    public static void main(String[] args) {
        // Fill the supermarket array
        supermarche[0] = new Vetement(123, "Jupe bleue taille S", 39.000f, 2, "Bleue", "S");
        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantalon noir taille M", 42.000f, 5, "Noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.410f, 18);

        // Process the purchase operation
        float totalAmount = 0.0f;
        for (Article article : supermarche) {
            if (article.estDispo(1)) {
                System.out.println("\n disponible :");
                article.decrire();
                float prixTTC = article.calculPrixTTC();
                System.out.println("Prix TTC à payer : " + prixTTC);
                totalAmount += prixTTC;
            } else {
                System.out.println("\n indisponible :");
                article.decrire();
                article.approvisionner(1);
                System.out.println(" approvisionné.");
            }
        }
        System.out.println("\nMontant total: " + totalAmount);
    }
}
