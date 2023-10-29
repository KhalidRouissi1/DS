package ds2020;

public class Boutique {
    private Vetement[] tabVet;
    private String nom;
    private  int nbVet=0;
    private int max=10;

    public Boutique(String nom,int taille) {
        this.tabVet=new Vetement[taille];
        this.nom = nom;
    }
    public void ajoutVetement (Vetement v) {
        if (nbVet < max) {
            tabVet[nbVet] = v;
            nbVet++;
        } else {
            System.out.println("La Boutique est FULL");
        }
    }
    public void afficheStock (int remise){
        for(int i=0;i<nbVet;i++){
            if (tabVet[i].qtStock!=0){
                System.out.println(tabVet[i].toString());
                System.out.println("le prix est "+tabVet[i].prixTTC(remise));
            }
        }
    }



}
