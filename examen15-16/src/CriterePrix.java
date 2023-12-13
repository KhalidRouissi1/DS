class CriterePrix  implements Critere {
    private double prixMax;

    public CriterePrix( double prixMax) {
        this.prixMax = prixMax;
    }

    @Override
    public boolean correspond(Object o) {
        if (o instanceof Voiture) {
            Voiture voiture = (Voiture) o;
            return voiture.getPrix() < prixMax;
        }
        return false;
    }
}