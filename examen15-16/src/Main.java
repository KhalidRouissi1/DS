public class Main {
    public static void main( String args[]) throws AjoutInterditException  {

        Agence A1= new Agence(100) ;
        Voiture V1=new Voiture("FORD ","Fiesta",2000,11.000) ;
        Voiture V2=new Voiture("KIA","Rio",2012,28.500) ;
        Voiture V3=new Voiture("KIA ","Picanto",2015,26.000) ;
        Voiture V4=new Voiture("FROD","Astra",2013,45.000) ;
        try {
            A1.ajout(V1);
        }catch (AjoutInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }try{
            A1.ajout(V2);
        }catch (AjoutInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }try{
            A1.ajout(V3);
        }catch (AjoutInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        try{
            A1.ajout(V4);
        }catch (AjoutInterditException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }


        CriterePrix c = new CriterePrix(30.900);
        A1.selectionne(c);

    }

}