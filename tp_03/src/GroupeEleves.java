// import java.util.ArrayList;
import java.util.*;

public class GroupeEleves {
    
    private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
    
    //renvoie le nombre d'Eleve(s) contenus dans listeEleves 
    public int nombre(){
        return this.listeEleves.size();
    }       
      
    //renvoie listeEleves.
    public ArrayList<Eleve> getListe() {
        return this.listeEleves;
    }
    //ajoute l'Eleve reçu en paramètre à listeEleves.
    public void ajouterEleve(Eleve eleve){
        this.listeEleves.add(eleve);
    }

    //renvoie l'Eleve dont le nom est indiqué par le paramètre
    public Eleve chercher(String nom){
        for(Eleve eleve :this.listeEleves){
            if(eleve.getNom().equals(nom)) return eleve;
        }
        return null;
    }

    public void lister(){
        System.out.println(this.listeEleves.toString());
    }

    @Override
    public String toString(){
        String str="";
        for(Eleve eleve :this.listeEleves){
            str+=eleve.toString()+"\n";
        }
        return str;
    }
}
