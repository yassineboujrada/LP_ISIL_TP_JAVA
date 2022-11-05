


public class test_serial {
    public static void main(String[] args) {
        etudiant student = new etudiant("yassine", "boujrada", 19);
        Salle salle = new Salle();
        serialSalle serie = new serialSalle();

        System.out.println("student info :\n"+student.afficher());
        System.out.println("class salle:");
        salle.ajouter_etudiant(new etudiant("yassine", "test0", 19));
        salle.ajouter_etudiant(new etudiant("khalid", "test1", 19));
        salle.ajouter_etudiant(new etudiant("omar", "test2", 19));
        salle.ajouter_etudiant(new etudiant("khadija", "test3", 19));
        System.out.println("number student in salle: "+salle.afficher_total_etudiant());

        System.out.println("class serial salle:");
        serie.saveSalleToSerialFile("salle.serial",salle);
        System.out.println("show file\n"+serie.getRealisateurToSerialFile("salle.serial"));
    }
}
