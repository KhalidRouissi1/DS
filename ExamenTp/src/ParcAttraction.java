import java.awt.*;

public class ParcAttraction {

    Attraction[] lesAttraction ;
    private String nom;
    private int nb_attraction = 0;
    private int taille;


    public ParcAttraction(String nom, int taille) {
        this.lesAttraction =  new Attraction[taille];
        this.nom  =  nom;
    }


    public void ajoutAttraction(Attraction att){
        if(nb_attraction < lesAttraction.length){
            lesAttraction[nb_attraction] = att;
            nb_attraction++;
        }
        else
            System.out.println("You cannot add the attraction is full");
    }

    float getRecet(){
        float total=0;
        for(int i=0;i<nb_attraction;i++){
            total+=lesAttraction[i].getRecette();
        }
        return total;
    }



    void affiche(){
        System.out.println("Le nom de parc est "+this.nom);
        for (int i=0;i<nb_attraction;i++){
            lesAttraction[i].affiche();
        }
    }


    public static void main(String[] args){
        ParcAttraction parc = new ParcAttraction("DA7DA7",29);

        ConditionAge c1 = new ConditionAge(18);
        ConditionAge c2 = new ConditionAge(20);
        ConditionAge c3 = new ConditionAge(35);




        Attraction a1 = new Attraction("RAIL",20,c1,20);
        Attraction a2 = new Attraction("RAIL2",30,c2,100);
        Attraction a3 = new Attraction("RAIL3",40,c3,50);



        Personne p1 = new Personne(17,170,"Ali");
        Personne p2 = new Personne(40,170,"Solaiment");
        Personne p3 = new Personne(30,170,"Asma");
        Personne p4 = new Personne(70,200,"Samira");
        Personne p5 = new Personne(120,170,"Samar");
        Personne p6 = new Personne(200,170,"Ben ali");


        try{
            a1.utilise(p1);
        }catch (AccesInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }  try{
            a1.utilise(p4);
        }catch (AccesInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        try{
            a2.utilise(p2);
        }catch (AccesInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        try{
            a2.utilise(p6);
        }catch (AccesInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        try{
            a3.utilise(p3);
        }catch (AccesInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        try{
            a3.utilise(p5);
        }catch (AccesInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        parc.ajoutAttraction(a1);
        parc.ajoutAttraction(a2);
        parc.ajoutAttraction(a3);
        System.out.println("The show Starteddddddddddddddddddddddddddddd");
        parc.affiche();
        System.out.println("Le recette global est "+parc.getRecet());
        System.out.println("The show Enddddddddddddddddddddddddddddddddddd");


    }
}
