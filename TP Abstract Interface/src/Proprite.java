import java.util.Objects;

public abstract class Proprite {

    private int id;
    private Personne responsable;
    private String adresse;
    protected double surfaceEnM2;

    public Proprite(int id, Personne responsable, String adresse, double surfaceEnM2) {
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surfaceEnM2 = surfaceEnM2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proprite proprite = (Proprite) o;
        return id == proprite.id && Double.compare(surfaceEnM2, proprite.surfaceEnM2) == 0 && Objects.equals(responsable, proprite.responsable) && Objects.equals(adresse, proprite.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, responsable, adresse, surfaceEnM2);
    }

    @Override
    public String toString() {
        return "Proprite{" +
                "id=" + id +
                ", responsable=" + responsable +
                ", adresse='" + adresse + '\'' +
                ", surfaceEnM2=" + surfaceEnM2 +
                '}';
    }


    abstract public double calculImpot();
}
