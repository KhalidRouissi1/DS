public class QteArticleException extends Exception {
    public QteArticleException(int choix) {
        super(choix ==1 ?"L’espace de stockage est insuffisant." : "la quantité en stock de l’article est insuffisante. !!");
    }


}
