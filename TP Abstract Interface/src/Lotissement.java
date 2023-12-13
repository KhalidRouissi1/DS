import java.security.cert.TrustAnchor;

public class Lotissement implements GestionPropriete {
    protected Proprite[] tabProp;
    protected int nombre = 0;

    public Lotissement(int capacite) {
        if (capacite <= MAX_PROPRIETES) {
            tabProp = new Proprite[capacite];
        } else {
            throw new IllegalArgumentException("Capacity exceeds the maximum allowed.");
        }
    }

    @Override
    public boolean ajouter(Proprite p) {
        if (this.nombre < tabProp.length) {
            this.tabProp[this.nombre] = p;
            this.nombre++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean supprime(Proprite p) {
        for (int i = 0; i < tabProp.length; i++) {
            if (tabProp[i] == null) {
                break;
            }
            if (tabProp[i].equals(p)) {
                for (int j = i; j < nombre; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                this.nombre--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void afficherProprites() {
        for (Proprite property : tabProp) {
            if (property == null) {
                break;
            }
            System.out.println(property + " valeur import" + property.calculImpot());
        }
    }

    public Proprite getproprieteByIndice(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;
    }

    public int getnbPieces() {
        int count = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropritePrive) {
                count += ((PropritePrive) tabProp[i]).nbPiéce;
            }
        }
        return count;
    }
}
