public class Villa extends PropritePrive{
    private boolean avecPiscine;

    public Villa(int id, Personne responsable, String adresse, double surfaceEnM2, int nbPiéce, boolean avecPiscine) {
        super(id, responsable, adresse, surfaceEnM2, nbPiéce);
        this.avecPiscine = avecPiscine;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() + "avecPiscine=" + avecPiscine +'}';
    }

    @Override
    public double calculImpot() {
        return super.calculImpot()+200;
    }
}
