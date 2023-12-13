public class Vente  extends  OperationStock {
    private int qteVendu;
    private double prixVente;

    public Vente() {

        try {
            mouvementerStock(art,qteVendu);
        }catch (QteArticleException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean estMouvementabe() {
        if(this.qteVendu>art.getStockMax())
        return (this.qteVendu-art.getStockMax()<art.getStockMax());
        else
            return (art.getStockMax()-this.qteVendu<art.getStockMax());

    }

    @Override
    public void mouvementerStock(Article a, int qte) throws QteArticleException {
        if(estMouvementabe()){
            a.setStockMax(a.getStockMax()-qte);
        }
        else{
            throw new QteArticleException(2);
        }
    }

    public double getPrixVente() {
        return prixVente;
    }

    @Override
    public String toString() {
        return "Vente{" +
                "qteVendu=" + qteVendu +
                ", prixVente=" + prixVente +
                '}';
    }


}
