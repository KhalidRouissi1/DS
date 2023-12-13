public class Achat  extends OperationStock  {
    private double prixAchat;
    private int QtiteAcheté;


    public Achat(int idOp, Article art) {
        try {
            mouvementerStock(art,QtiteAcheté);
        }catch (QteArticleException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    @Override
    public String toString() {
        return "Achat{" +
                "prixAchat=" + prixAchat +
                ", QtiteAcheté=" + QtiteAcheté +
                '}';
    }

    @Override
    public boolean estMouvementabe() {
        return (this.QtiteAcheté+art.getStockMax()<art.getStockMax());
    }

    @Override
    public void mouvementerStock(Article a, int qte) throws QteArticleException {
           if(estMouvementabe()){
               a.setStockMax(a.getStockMax()+qte);
           }
            else{
                throw new QteArticleException(1);
           }
    }
}
