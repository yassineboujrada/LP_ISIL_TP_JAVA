

import java.io.Serializable;

public class etudiant implements Serializable{
    static private final long serialVersionUID = 4L;
    private String nom;
    private String prenom;
    private int age;

    public etudiant(String name,String prenom,int age){
        this.nom=name;
        this.prenom=prenom;
        this.age=age;
    }

    public String afficher(){
        return nom+" "+prenom+" "+age+" annee";
    }

    public void setNom(String name){
        this.nom=name;
    }

    public String getNom(){
        return this.nom;
    }

    public void setPrenom(String name){
        this.prenom=name;
    }
    
    public String getPrenom(){
        return this.prenom;
    }

    public void setAge(int age){
        this.age=age;
    }
    
    public int getAge(){
        return this.age;
    }
}
