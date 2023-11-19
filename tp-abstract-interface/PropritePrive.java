public   class PropritePrive extends Proprite {
    public PropritePrive(int id, Personne responsable, String adresse, double surfaceEnM2, int nbPiéce) {
        super(id, responsable, adresse, surfaceEnM2);
        this.nbPiéce = nbPiéce;
    }

    protected int nbPiéce;

    @Override
    public String toString() {
        return "PropritePrive{" +
                "nbPiéce=" + nbPiéce +
                '}';
    }
    public  double calculImpot(){
        return 50/100 * super.surfaceEnM2+10/this.nbPiéce;
    }

}
