// import java.util.ArrayList;
import java.util.*;

public class Group_Eleve {
    
    private ArrayList<Eleve_v2> listeEleves = new ArrayList<Eleve_v2>();
    
    //renvoie le nombre d'Eleve(s) contenus dans listeEleves 
    public int nombre(){
        return this.listeEleves.size();
    }       
      
    //renvoie listeEleves.
    public ArrayList<Eleve_v2> getListe() {
        return this.listeEleves;
    }
    //ajoute l'Eleve reçu en paramètre à listeEleves.
    public void ajouterEleve(Eleve_v2 eleve){
        this.listeEleves.add(eleve);
    }

    //renvoie l'Eleve dont le nom est indiqué par le paramètre
    public Eleve_v2 chercher(String nom){
        for(Eleve_v2 eleve :this.listeEleves){
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
        for(Eleve_v2 eleve :this.listeEleves){
            str+=eleve.toString()+"\n";
        }
        return str;
    }

    // ex4
    public Eleve_v2 meilleurEleve() {
		return Collections.max(listeEleves);
	}

	public void trierEleves() {
		Collections.sort(this.listeEleves);
	}
}
