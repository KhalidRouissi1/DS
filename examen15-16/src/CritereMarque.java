class CritereMarque implements Critere {
    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }

    @Override
     public boolean correspond(Object o) {
        if (o instanceof Voiture) {
            Voiture voiture = (Voiture) o;
            return voiture.getMarque().equals(marque);
        }
        return false;
    }
}
