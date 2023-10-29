package ds2020;

public class Vetement {
    protected String code;
    protected String libelle;

    protected  String color;
    protected float prixHT;
    protected float qtStock;
    protected final float TVA=0.18f;

    public Vetement(String code, String libelle, String color, float prixHT) {
        this.code = code;
        this.libelle = libelle;
        this.color = color;
        this.prixHT = prixHT;
    }

    public void setQtStock(float qtStock) {
        this.qtStock = qtStock;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" : "+code+" "+libelle+" "+color+" : "+"PrixHT = "
                +prixHT+" et quantite = "+qtStock;
    }
    public float prixTTC (){
        return prixHT*(1+TVA/100);
    }
    public float prixTTC (int remise){
        return prixTTC()*(1- (float) remise /100);
    }
}
