public class PropriteProfesionelle extends Proprite {
    public PropriteProfesionelle(int id, Personne responsable, String adresse, double surfaceEnM2, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surfaceEnM2);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }

    private int nbEmployes;
    private boolean estEtatique;

    @Override
    public double calculImpot() {
        return estEtatique?  0.5*    super.surfaceEnM2 +30 : 0;
    }
}


