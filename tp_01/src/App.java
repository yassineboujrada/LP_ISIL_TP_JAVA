
public class App {
    public static void main(String[] args){
        try {
            System.out.println("##########  Premier TP  ##########");
            EntNat a = new EntNat(3);
            EntNat b = new EntNat(4);
            // EntNat c = new EntNat(-2);

            // exercice 1
            // System.out.println(a.getN());
            // System.out.println(c.getN());

            // exercice 2
            System.out.println("a ==> "+a.getN()+"\nb ==> "+b.getN());
            System.out.println("Somme : "+EntNat.somme(a,b));
            System.out.println("Deffernce : "+EntNat.diff(a,b));
            System.out.println("Produit : "+EntNat.produit(a,b));

        } catch (Exception e) {
            System.out.println("Error :( \n"+e);
        }
        

    }
}
