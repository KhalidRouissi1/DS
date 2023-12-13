class ProduitGC extends Article {
    public ProduitGC(long ref, String lib, float p, int q) {
        super(ref, lib, p, q);
    }

    @Override
    public float calculPrixTTC() {
        return prixHT * (1 + (float) TVA_PERCENTAGE);
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Type: Prodcut Grande Consommation");
    }
}
