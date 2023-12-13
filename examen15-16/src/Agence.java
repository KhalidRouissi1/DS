public class Agence {
    Voiture[] LesVoiture;
    String reference;
    int taille;
    int nbrvoitures;


    public Agence(int taille) {
        this.taille = taille;
        LesVoiture = new Voiture[taille];
    }

    void selectionne(Critere c){
        for(int i =0;i<nbrvoitures;i++){
            if(c.correspond(LesVoiture[i])){
                System.out.println(LesVoiture[i]);
            }
        }
    }
     void ajout(Voiture voiture) throws AjoutInterditException {
        int anneeCourante = 2016;
        if (anneeCourante - voiture.getAnne() > 5) {
            throw new AjoutInterditException("Ajout interdit : la voiture est trop ancienne.");
        }
        if (this.nbrvoitures < taille) {
            this.LesVoiture[this.nbrvoitures++] = voiture;
        }
     }


}
