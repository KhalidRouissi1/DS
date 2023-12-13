public class Fiscalité {



    private Lotissement lot =  new Lotissement(10);
    Lotissement lt= new LotissementPrivée(10);

    private Personne p1 = new Personne(1111,"Salah","Ali");

    private Personne p2  =new Personne(1111,"Weld","Ali");

    private Personne p3 = new Personne(1111,"(5ow","Ali");
   private Proprite prop1= new PropritePrive(1,p1,"Corniche",350,4);
   private Proprite prop2 = new  Villa(2,p2,"Dar Chaabane", 400,6,true);
   private  Proprite prop3 = new Appartement(3,p2,"Hammamet",1200,8, 3);
   private  Proprite prop4 = new PropriteProfesionelle(4,p3,"Korba", 1000, 50,true);
   private Proprite prop5 = new  PropriteProfesionelle(5,p1,"Bir Bouragba",2500, 400, false);
    public double propAmois(){
        double mois  = lot.tabProp[0].calculImpot();
        for(int i =1;i<lot.tabProp.length;i++)
        {
            if(lot.tabProp[i] == null){
                break;
            }
            if(mois < lot.tabProp[i].calculImpot()){
                mois = lot.tabProp[i].calculImpot();
            }
        }
        return mois;
    }
    public static void main(String[] args) {
        Fiscalité fiscalite = new Fiscalité();
        fiscalite.lot.ajouter(fiscalite.prop1);
        fiscalite.lot.ajouter(fiscalite.prop2);
        fiscalite.lot.ajouter(fiscalite.prop3);
        fiscalite.lot.ajouter(fiscalite.prop4);
        fiscalite.lot.ajouter(fiscalite.prop5);
        System.out.println("AFTER DELETING");
        Proprite prop6= new PropritePrive(1,fiscalite.p1,"xx",350,4);
        fiscalite.lot.supprime(prop6);
        fiscalite.lot.afficherProprites();
        fiscalite.lt.ajouter(fiscalite.prop1);
        System.out.println("La prpprite a moins impot est: "+fiscalite.propAmois());
        fiscalite.lt.ajouter(fiscalite.prop5);
        fiscalite.lt.afficherProprites();
        fiscalite.lt.getnbPieces();
    }
}