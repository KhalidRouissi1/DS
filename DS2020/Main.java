package ds2020;

public class Main {
    public static void main(String[] args) {
        Boutique boutique=new Boutique("Lily_Boutique",50);
        Vetement v1=new VetementEnfant("R100","Robe","Rouge",29.900f,0.5f);
        v1.setQtStock(10);
        Vetement v2=new Vetement("M200","Manteau","gris",196.900f);
        v2.setQtStock(5);
        v2.setQtStock(0);
        boutique.ajoutVetement(v1);
        boutique.ajoutVetement(v2);
        boutique.afficheStock(60);
    }

    }
