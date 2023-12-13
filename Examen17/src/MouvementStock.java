public interface MouvementStock {
    public boolean estMouvementabe();
    public void mouvementerStock (Article a, int qte) throws QteArticleException;
}