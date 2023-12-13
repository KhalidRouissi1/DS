public class Attraction {
    private String nom;
    private double cout;
    private ConditionAge conditionAge;
    private int nbrPersonne=0;
    private double recette=0;

    public Attraction(String nom, double cout, ConditionAge conditionAge, int nbrPersonne) {
        this.nom = nom;
        this.cout = cout;
        this.conditionAge = conditionAge;
        this.nbrPersonne = nbrPersonne;
    }


    public void affiche(){
        System.out.println( "Attraction{" +
                "nom='" + nom  +
                ", condition=" + conditionAge +
                ", recette=" + recette +
                '}'
        );
    }

   public void utilise(Personne p) throws  AccesInterditException{
        if(!conditionAge.accesPossible(p)){
            throw new AccesInterditException("La condation daces ne respecte pas");
        }else{
            this.nbrPersonne++;
            this.recette+=this.cout;
        }
    }


    public double getRecette() {
        return recette;
    }

    public String getNom() {
        return nom;
    }
}
