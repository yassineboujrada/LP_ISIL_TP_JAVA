public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Eleve e = new Eleve("yassine");
        Eleve e1 = new Eleve("abdo");
        Eleve e2 = new Eleve("khadija");
        Eleve e3 = new Eleve("khalid");
        Eleve e4 = new Eleve("fahd");
        e.ajouterNote(10);
        e.ajouterNote(-5);
        e.ajouterNote(22);
        e.ajouterNote(16);
        System.out.println(e.getListeNotes());
        // System.out.println(e.getMoyenne());
        System.out.println(e.toString());


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
        GroupeEleves gr=new GroupeEleves();
        System.out.println(gr.nombre());
        System.out.println(gr.getListe());
        gr.ajouterEleve(e1);
        gr.ajouterEleve(e2);
        gr.ajouterEleve(e3);
        gr.ajouterEleve(e4);
        System.out.println("We found:\n"+gr.chercher("khadija"));
        System.out.println("We found:\n"+gr.chercher("Omar"));
        gr.lister();
    }
}
