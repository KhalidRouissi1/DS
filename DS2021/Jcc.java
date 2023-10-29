package DS2021;

public class Jcc  {
    private Film[] competition;
    private int annee;
    final int NBFMAX =30;
    private int nbF=0;

    public Jcc(int taille, int annee) {
        if(taille > NBFMAX)
        {
            System.out.println("your size is bigger than the allowed places");
            return;
        }
        this.competition = new Film[taille];
        this.annee = annee;
    }
    public void ajoutFilm(Film f)
    {
        if(nbF+1 >competition.length)
        {
            System.out.println(" « La compétition est au complet ».");
        }
        else {
            competition[nbF] = f;
            nbF++;
        }

    }

    public void listeFilmsJCC()
    {
        for(int i =0;i<competition.length;i++)
        {
            System.out.println(competition[i].toString());
        }

    }
    public float totalVenteBilletsJCC()
    {
        float total=0;
        for(int i =0;i<competition.length;i++)
        {
            total+=competition[i].totalVenteBillets();
        }
        return total;
    }


}
