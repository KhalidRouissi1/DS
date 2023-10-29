package ds2020;

public class VetementEnfant extends Vetement {
    private float age;

    public VetementEnfant(String code, String libelle, String color, float prixHT, float age) {
        super(code, libelle, color, prixHT);
        this.age = age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() +" Age : "+age;
    }

    @Override
    public float prixTTC(int remise) {
        float montant = 0;
        if (remise < super.prixHT * 0.5) {
            montant = super.prixTTC(remise);
        }
        else{
            montant=super.prixTTC();
        }
        return montant;
    }

}

