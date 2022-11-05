import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException{
        String file_name;
        final int Max=20;
        Scanner input = new Scanner(System.in);
        char[] nom = new char[Max];
        char[] prenom = new char[Max];
        int annee;
        
        System.out.println("Nom du fichier a creer : ");
        file_name = input.next();

        DataInputStream sortie = new DataInputStream(new FileInputStream(file_name));
        boolean eof = false ; // sera mis a true par exception EOFile 
        while (!eof){
            try{
                // read info
                for (int i = 0; i < Max ; i++) {
                    nom[i]=sortie.readChar() ;
                }
                for (int i = 0; i < Max ; i++) {
                    prenom[i]=sortie.readChar() ;
                }
                annee=sortie.readInt();

                //show info
                System.out.println("\nnom =>");
                for (int i = 0; i < Max ; i++) {
                    System.out.print(nom[i]);
                }
                System.out.println("\nprenom =>");
                for (int i = 0; i < Max ; i++) {
                    System.out.print(prenom[i]);
                }
                System.out.println("\nannee => "+annee);
            }catch (EOFException e){ 
                eof = true ; 
            }
        }
        sortie.close () ;
        System.out.println ("*** fin liste fichier ***");
    }
}
