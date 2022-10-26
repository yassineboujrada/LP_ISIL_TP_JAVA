

public class EntNat {
    private int n;

    public EntNat(int value) throws ErrConst{
        if(value<0) throw new ErrConst();
        this.n=value;
    }

    static int somme(EntNat a,EntNat b) throws ErrSom{
        if(b.getN()+a.getN()>Integer.MAX_VALUE) throw new ErrSom();
        return b.getN()+a.getN();
    }

    static int diff(EntNat a,EntNat b) throws ErrDiff{
        if(a.getN()-b.getN()>Integer.MAX_VALUE) throw new ErrDiff();
        return a.getN()-b.getN();
    }

    static int produit(EntNat a,EntNat b) throws ErrProd{
        if(a.getN()*b.getN()>Integer.MAX_VALUE) throw new ErrProd();
        return a.getN()*b.getN();
    }

    public int getN(){
        return this.n;
    }

    public void setN(int new_value){
        this.n = new_value;
    }
}

class ErrConst extends Exception{}
class ErrSom extends ErrConst{}
class ErrDiff extends ErrConst{}
class ErrProd extends ErrConst{}
