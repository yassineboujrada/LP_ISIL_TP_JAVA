

public class Tst_Eleve {
    public static void compare(Eleve_v2 eleve1, Eleve_v2 eleve2) {
        int compar_two_object = eleve1.compareTo(eleve2);
        if (compar_two_object > 0) 
            System.out.println(eleve1.getNom() + " is better than " +
                    eleve2.getNom());
        else  if  (compar_two_object ==  0) 
            System.out.println(eleve1.getNom() + " and " + eleve2.getNom()  + "  are equals"); 
        else System.out.println(eleve2.getNom() + " is better than "  + eleve1.getNom());
    }
    public static void main(String[] args) throws Exception {
      
        Eleve_v2 e3 = new Eleve_v2("khalid");
        Eleve_v2 e4 = new Eleve_v2("fahd");

        e3.ajouterNote(10);
        e3.ajouterNote(5);
        e3.ajouterNote(22);
        e3.ajouterNote(16);

        e4.ajouterNote(10);
        e4.ajouterNote(15);
        e4.ajouterNote(22);
        e4.ajouterNote(16);

        compare(e3, e4);
    }
}
    