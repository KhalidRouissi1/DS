public class Appartement  extends PropritePrive{
    private int numEtage;

    public Appartement(int id, Personne responsable, String adresse, double surfaceEnM2, int nbPiéce, int numEtage) {
        super(id, responsable, adresse, surfaceEnM2, nbPiéce);
        this.numEtage = numEtage;
    }

    @Override
    public String toString() {
        return "Appartement{" +super.toString()+
                "numEtage=" + numEtage +
                '}';
    }
}
