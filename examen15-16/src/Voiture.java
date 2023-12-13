class Voiture
{ String marque ;
    String modele ;
    int anneP;
    double prix;
    public Voiture(String m,String mo , int a, double p)
    {

        this.marque= m;
        this.modele = mo;
        this.prix = p;
        this.anneP = a;
    }
    public String getMarque(){ return marque ;}
    public String getModele() { return modele;}
    public int getAnne() { return anneP;}
    public double getPrix() { return prix;}

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", anneP=" + anneP +
                ", prix=" + prix +
                '}';
    }


}