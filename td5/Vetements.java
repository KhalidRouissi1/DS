class Vetement extends Article implements Promotion {
     private String couleur;
     private String taille;

     public Vetement(long ref, String lib, float p, int q, String couleur, String taille) {
          super(ref, lib, p, q);
          this.couleur = couleur;
          this.taille = taille;
     }

     @Override
     public float calculPrixTTC() {
          if (estPeriodePromo("21/03/2023")) {
               return prixDeVente("21/03/2023");
          } else {
               return prixHT * (1 + (float) TVA_PERCENTAGE);
          }
     }

     @Override
     public void decrire() {
          super.decrire();
          System.out.println("Type: Vetement, Couleur: " + couleur + ", Taille: " + taille);
     }

     @Override
     public float prixDeVente(String dateStr) {
          float prixRemise = prixHT - (prixHT * 0.3f);
          return prixRemise * (1 + (float) TVA_PERCENTAGE);
     }

     @Override
     public boolean estPeriodePromo(String dateStr) {
          return Promotion.super.estPeriodePromo(dateStr);
     }
}
