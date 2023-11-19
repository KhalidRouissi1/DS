public class LotissementPrivée extends  Lotissement{
    public LotissementPrivée(int capacite) {
        super(capacite);
    }
    @Override
    public boolean ajouter(Proprite p){
        if(p instanceof PropritePrive)
        {
            return super.ajouter(p);
        }
        return false;
    }
    @Override
    public PropritePrive getproprieteByIndice(int i)
    {
        if(super.getproprieteByIndice(i) instanceof PropritePrive)
        {
            return (PropritePrive) super.getproprieteByIndice(i);
        }
        else
            return null;
    }
    @Override
    public int getnbPieces(){
        int count  =0;
        for(int i =0;i<super.tabProp.length;i++)
        {
            if(super.tabProp[i] instanceof PropritePrive)
            {
                count++;
            }
        }
        return  count;
    }
}
