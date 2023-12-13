import java.util.Objects;

public class Article {
    private String code;
    private String libelle;
    private int qteStock;
    private int stockMax;
    public Article(String code, String libelle, int qteStock, int stockMax) {
        this.code = code;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.stockMax = stockMax;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    @Override
    public String toString() {
        return "Article{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", qteStock=" + qteStock +
                ", stockMax=" + stockMax +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(libelle, article.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, libelle, qteStock, stockMax);
    }
}
