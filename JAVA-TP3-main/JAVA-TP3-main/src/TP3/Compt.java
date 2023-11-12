package TP3;

public class Compt {


    private int num;
    private double solde;
    private double decouvertMax;
    private double debutMax;

    static  int counter = 0;

    private Personne titulaire ;

    public Compt(Personne p ) {
        counter++;
        num = counter;
        solde =   0;
        decouvertMax = 800;
        debutMax = 1000;



    }

    public Compt(double solde, double decouvertMax, double debutMax ,Personne p ) {
        counter++;
        num = counter;
        this.solde = solde;
        this.decouvertMax = decouvertMax;
        this.debutMax = debutMax;
        this.titulaire   = p;
    }


    @Override
    public String toString() {
        return "Compt{" +
                "num=" + num +
                ", solde=" + solde + "Dt"+
                ", Nom=" + titulaire.nom +
                ", preonm" + titulaire.prenom+
                ", address" + titulaire.address+
                '}';
    }



    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public void setDebutMax(double debutMax) {
        this.debutMax = debutMax;
    }

    public int getNum() {
        return num;
    }

    public String getName()
    {
        return  titulaire.nom;
    }
    public String getLastName()
    {
        return  titulaire.prenom;
    }
    public double getSolde() {
        return solde;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public double getDebutMax() {
        return debutMax;
    }

    public void crediter(double toAdd)
    {
        if(toAdd < 0)
        {
            System.out.println("You cannot add a negative solde");
        }
        else {
            this.solde+=toAdd;
        }
    }

    public boolean debiter(double montant)
    {
        double resteSolde = this.solde - montant;
        if(montant>0)
        {
            if(resteSolde > decouvertMax)
            {
                this.solde =  resteSolde;
                return  true;
            }
            else {
                System.out.println("There is a problem");
                return false;
            }
        }
        return  false;
    }


    public void retrait(double montant)
    {


        if(montant< debutMax)
        {
            debiter(montant);
        }
    }

    boolean estaDecouvert()
    {
        return this.solde< 0;
    }
    double montantDecouvert()
    {
        if(estaDecouvert())
            return  Math.abs(this.solde);
        else
            return 0;


    }


    public void Virement(Compt c1,double montant)
    {
        if( c1.debiter(montant))
        {
            this.crediter(montant);

        }
    }


    public static void Virement(Compt c1,Compt c2,double montant)
    {
        if( c1.debiter(montant)){
            c2.crediter(montant);

        }
    }


}