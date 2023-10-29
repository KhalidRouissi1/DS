package DS2021;

public class Documentaire extends Film{
    private String sujet;
    private float tarif=2;

    public Documentaire(String titre, String realisateur, String payesOrigin, int duree, String sujet) {
        super(titre, realisateur, payesOrigin, duree);
        this.sujet = sujet;
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return sujet.toString() +
                "sujet='" + sujet + '\'' +
                ", tarif=" + tarif +
                '}';
    }
    @Override
    public float totalVenteBillets()
    {
        return  (2*super.getNbrDePlace());
    }
}
