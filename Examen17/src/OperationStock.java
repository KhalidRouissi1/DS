abstract public class OperationStock implements MouvementStock {
    private static int idOpS = 0;
    private int idOp;
    protected Article art;


    public void OperationStock() {
        idOpS++;
        this.idOp = idOpS;
        this.art = art;
    }

    @Override
    public String toString() {
        return "OperationStock{" +
                "idOp=" + idOp +
                ", art=" + art +
                '}';
    }
}
