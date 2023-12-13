class ProduitElec extends Article implements Promotion {
    private String categorie;

    public ProduitElec(long ref, String lib, float p, int q, String categorie) {
        super(ref, lib, p, q);
        this.categorie = categorie;
    }

    @Override
    public float calculPrixTTC() {
        if (estPeriodePromo("21/03/2023")) {
            return prixDeVente("21/03/2023");
        } else {
            return prixHT * (1.08f + (float) TVA_PERCENTAGE); // 8% de taxe supplémentaire pour l'électronique
        }
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Type: Product Electronique, Categorie: " + categorie);
    }

    @Override
    public float prixDeVente(String dateStr) {
        float prixRemise = prixHT - (prixHT * 0.2f);
        return prixRemise * (1.08f + (float) TVA_PERCENTAGE);
    }

    @Override
    public boolean estPeriodePromo(String dateStr) {
        return Promotion.super.estPeriodePromo(dateStr);
    }
}
