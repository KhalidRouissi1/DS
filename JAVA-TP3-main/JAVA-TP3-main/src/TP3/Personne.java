package TP3;

public class Personne {


    protected  String nom;
    protected String prenom;
    protected String address;

    public Personne(String nom, String prenom, String address) {
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


