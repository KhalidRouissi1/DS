public class Stock {
    private OperationStock[] tabOp;
    private int nbOp=0;

    public Stock(OperationStock[] tabOp, int max) {
        this.tabOp = new OperationStock[max];
    }

    public void ajouterOp(OperationStock e){
        if(nbOp < tabOp.length)
        {
            this.nbOp++;
            this.tabOp[this.nbOp] = e;

        }

    }

    public void affichOpAchat(){
        for(int i=0;i<nbOp;i++){
            System.out.println(tabOp[i]);
        }
    }
    public void meilleurPrixVente(Article a){
        Vente v = tabOp[0];
        for(int i=0;i<nbOp;i++){

            if(a instanceof Vente){


        }

    }
    }
}
