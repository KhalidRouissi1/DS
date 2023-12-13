public class ResultatPoints implements Resultat{
    private int nbrPoint;

    public ResultatPoints(int nbrPoint) {
        this.nbrPoint = nbrPoint;
    }

    public int getNbrPoint() {
        return nbrPoint;
    }

    @Override
    public int compareTo(Resultat r) {
        if(r instanceof ResultatOral){
            if(((ResultatPoints) r).getNbrPoint()==this.getNbrPoint()){
                return  0;
            } else if (((ResultatPoints) r).getNbrPoint()<this.getNbrPoint()) {
                return 1;
            }
            else{
                return -1;
            }
        }
        throw new IllegalArgumentException();

    }
}
