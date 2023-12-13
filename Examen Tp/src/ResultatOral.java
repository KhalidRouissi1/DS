public class ResultatOral implements Resultat{
    private char appréciation;

    public ResultatOral(char appréciation) {
        if(appréciation != 'A' ||appréciation != 'B' ||appréciation != 'C' ){
            return;
        }
        else {
            this.appréciation = appréciation;
        }
    }

    @Override
    public int compareTo(Resultat r) {
      if(r instanceof ResultatOral){
          if(((ResultatOral) r).getAppréciation()==this.getAppréciation()){
              return  0;
          } else if (((ResultatOral) r).getAppréciation()<this.getAppréciation()) {
                return 1;
          }
          else{
              return -1;
          }
      }
        throw new IllegalArgumentException();

    }

    public char getAppréciation() {
        return appréciation;
    }
}
