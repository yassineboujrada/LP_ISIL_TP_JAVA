public class tst_groupe {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Eleve e = new Eleve("yassine");
        Eleve e1 = new Eleve("abdo");
        Eleve e2 = new Eleve("khadija");
        Eleve_v2 e3 = new Eleve_v2("khalid");
        Eleve_v2 e4 = new Eleve_v2("fahd");
        // e.ajouterNote(10);
        // e.ajouterNote(-5);
        // e.ajouterNote(22);
        // e.ajouterNote(16);
        // System.out.println(e.getListeNotes());
        // // System.out.println(e.getMoyenne());
        // System.out.println(e.toString());
        e1.ajouterNote(10);
        e1.ajouterNote(-5);
        e1.ajouterNote(22);
        e1.ajouterNote(16);

        e2.ajouterNote(10);
        e2.ajouterNote(-5);
        e2.ajouterNote(22);
        e2.ajouterNote(16);

        e3.ajouterNote(10);
        e3.ajouterNote(-5);
        e3.ajouterNote(22);
        e3.ajouterNote(16);

        e4.ajouterNote(10);
        e4.ajouterNote(-5);
        e4.ajouterNote(22);
        e4.ajouterNote(16);
        Group_Eleve gr=new Group_Eleve();
        System.out.println(gr.nombre());
        System.out.println(gr.getListe());
        // gr.ajouterEleve(e1);
        // gr.ajouterEleve(e2);
        gr.ajouterEleve(e3);
        gr.ajouterEleve(e4);
        System.out.println(gr.chercher("khadija"));
        System.out.println(gr.chercher("Omar"));
        gr.lister();

        //ex4
		System.out.println("Meilleur(e) eleve : " + gr.meilleurEleve().getNom());
		gr.trierEleves();
		System.out.println("\nOn trie la liste");
        gr.lister();
    }
}
