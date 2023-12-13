import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Article {
    protected long reference;
    protected String libelle;
    protected float prixHT;
    protected int qteStock;
    protected static final double TVA_PERCENTAGE = 0.1;

    // Constructor
    public Article(long ref, String lib, float p, int q) {
        reference = ref;
        libelle = lib;
        prixHT = p;
        qteStock = q;
    }

    public void approvisionner(int nb) {
        qteStock += nb;
    }

    public void decrire() {
        System.out.println("Reference: " + reference + ", Libelle: " + libelle);
    }

    public abstract float calculPrixTTC();

    public boolean appartientPromo() {
        return false;
    }

    public boolean estDispo(int qteAchat) {
        return qteStock >= qteAchat;
    }

    public String getLibelle() {
        return libelle;
    }
}
