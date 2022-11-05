

import java.io.Serializable;
import java.util.ArrayList;

public class Salle implements Serializable{
    static private final long serialVersionUID = 2L;
    private ArrayList<etudiant> liste_Etudiants = new ArrayList<etudiant>();

    public void ajouter_etudiant(etudiant student){
        this.liste_Etudiants.add(student);
    }

    public int afficher_total_etudiant(){
        return this.liste_Etudiants.size();
    }

    @Override
    public String toString(){
        String str="";
        for(etudiant eleve :this.liste_Etudiants){
            str+=eleve.toString()+"\n";
        }
        return str;
    }
}
