import java.io.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException{
        String file_name,chNom, chPrenom;
        final int longMaxNom = 20 ;
        final int longMaxPrenom = 20 ; 
        int annee,n,j;
        char[] nom = new char[longMaxNom];
        char[] prenom = new char[longMaxNom];

        Scanner input = new Scanner(System.in);

        System.out.println("les nombres des donnees : ");
        n = input.nextInt();

        System.out.println("Nom du fichier a creer : ");
        file_name = input.next();

        DataOutputStream sortie = new DataOutputStream(new FileOutputStream(file_name));

        // while (true) 
        for (j=0;j<n ;j++){
            System.out.print("nom => "+(j+1)+" : ");
            chNom = input.next();
            if (chNom.length()==0) {
                break;
            }

            System.out.print("prenom => ");
            chPrenom = input.next();

            System.out.print("annee de naissance => ");
            annee = input.nextInt();

            for (int i = 0 ; (i < chNom.length())&&(i<longMaxNom) ; i++) {
                nom[i] = chNom.charAt(i) ;
            }

            for (int i = 0 ; (i < chPrenom.length())&&(i<longMaxPrenom) ; i++) {
                prenom[i] = chPrenom.charAt(i) ;
            }
            
            /* ecriture fichier */
            for (int i=0 ; i<longMaxNom ; i++) sortie.writeChar(nom[i]) ;
            for (int i=0 ; i<longMaxPrenom ; i++) sortie.writeChar(prenom[i]) ; 
            sortie.writeInt(annee);
        }

        sortie.close() ;
        System.out.println ("**** fin creation fichier ****") ;
    }
}
