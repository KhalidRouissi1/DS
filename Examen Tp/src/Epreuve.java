import com.sun.source.tree.TryTree;

public class Epreuve {
    private String denomination;
    private int max;

    private boolean done = false;
    private Candidat[] cand;
    private int nb = 0;
    public Epreuve(String denomination , int max) {
        this.denomination = denomination;
        this.max = max;
        cand = new Candidat[max];
    }
    @Override
    public String toString() {
        String allCand ="";
        for(int i =0;i<nb;i++)
        {
            allCand+=cand[i].getNon()+'\n';
        }
        return "Epreuve{" +
                "denomination='" + denomination + '\'' +
                ", max=" + max +
                "} All Cands "+ allCand;
    }

    void ajouterCandidat(Candidat c){
        if(nb < max && !done){
            cand[this.nb] = c;
            this.nb++;
        }

    }

    void terminer(){
        this.done = true;
    }
    boolean estTerminer(){
        return this.done;
    }

     Resultat getRecord(){
        Resultat maxNote = cand[0].getResultat();
        for(int i =1;i<nb;i++)
        {
            try {
                if(cand[i].getResultat().compareTo(maxNote)== 1){
                    maxNote = cand[i].getResultat();
                }

            }catch (IllegalArgumentException e){
                System.out.println(e.getStackTrace());
                System.out.println(e.getMessage());
            }

        }
        return  maxNote;
    }


    Candidat getVinqueur(){
        Resultat maxRes = getRecord();
        try{
            if(estTerminer()){
                for(int i =0;i<nb;i++)
                {
                    if(cand[i].getResultat().compareTo(maxRes) == 0){
                        return cand[i];
                    }

                }
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return null;
    }


    void fixeResulatat(int id,Resultat r) throws IllegalUpdateException{
        boolean test  = false;
            for(int i = 0;i< nb;i++){
                if(cand[i].getId() == id){
                    cand[i].setResultat(r);
                    test = true;
                    break;
                }
            }
            if(!test)
                throw new IllegalUpdateException("There is no id like that id that you gave me ");
    }

    Resultat getResulatat(int id ){
        for(int i =0;i<nb;i++)
        {
            if(cand[i].getId() == id){
                return cand[i].getResultat();
            }
        }
        return null;
    }



    public static void main(String[] args){
        Epreuve ep = new Epreuve("Master ISET Nabeul",10);
        Candidat c1  =new Candidat(1,"Wled Ali");
        Candidat c2=new Candidat(3,"Ali");
        Candidat c3  =new Candidat(2,"Bouali");
        ResultatOral rO1 = new ResultatOral('A');
        ResultatOral rO2 = new ResultatOral('C');
        ResultatOral rO3 = new ResultatOral('C');
        ep.ajouterCandidat(c1);
        ep.ajouterCandidat(c2);
        ep.ajouterCandidat(c3);
        try {
            ep.fixeResulatat(1,rO1);
            ep.fixeResulatat(2,rO2);
            ep.fixeResulatat(3,rO3);

        }catch (IllegalUpdateException e){
            System.out.println(e.getMessage());
        }
        ep.terminer();
        System.out.println("Le vainqueur est "+ep.getVinqueur().getNon());
        if(ep.getVinqueur().getResultat() instanceof ResultatOral ){
            System.out.println();
            System.out.println("le RESULTAT EST "+((ResultatOral) ep.getVinqueur().getResultat()).getAppréciation());
        }
        if(ep.getVinqueur().getResultat() instanceof ResultatPoints ){
            System.out.println("le RESULTAT EST "+((ResultatPoints) ep.getVinqueur().getResultat()).getNbrPoint());
        }
    }
}