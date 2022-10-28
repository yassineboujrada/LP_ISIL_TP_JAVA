import java.util.ArrayList;

public class Eleve {

    private String nom;
    private ArrayList<Integer> note = new ArrayList<Integer>();
    private double moyenne = 0;

    public Eleve(String nom){
        this.nom=nom;
    }

    public double getMoyenne() {
        return this.moyenne;
    }

    public void ajouterNote(int note) {
        if(note<0) note=0;
        else {
            if(note>20) note=20;
        }
        this.moyenne = (this.moyenne * this.note.size() + note) / (this.note.size() + 1);
        this.note.add(note);
    }
    public String getNom(){
        return this.nom;
    }
    public ArrayList<Integer> getListeNotes(){
        return this.note;
    }

    @Override
    public String toString(){
        return "name =>"+this.nom+"\nmoyenne => "+this.moyenne+"\nnote => "+this.note+"\n";
    }
}
