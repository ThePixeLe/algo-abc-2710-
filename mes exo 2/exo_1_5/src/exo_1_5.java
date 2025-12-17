import java.util.*;

public class exo_1_5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INVERSION DE DEUX VALEURS");
        
        
        // LECTURE des valeurs à inverser

        System.out.print("Entrez la première valeur (a) : ");
        int a = sc.nextInt();
        
        System.out.print("Entrez la deuxième valeur (b) : ");
        int b = sc.nextInt();
        
        // AFFICHAGE AVANT inversion

        System.out.printf("\nAVANT inversion : a = %d, b = %d\n", a, b);
        
        //  PROCESSUS D'INVERSION - MÉTHODE DES 3 VERRES :
        // Imaginez échanger le contenu de deux verres sans les mélanger
        // Il vous faut un 3ème verre temporaire!
        
        int temporaire = a;  // ÉTAPE 1 : Verser le contenu de a dans temporaire
        a = b;               // ÉTAPE 2 : Verser le contenu de b dans a
        b = temporaire;      // ÉTAPE 3 : Verser l'ancien a (temporaire) dans b
        
        //  AFFICHAGE APRÈS inversion

        System.out.printf("APRÈS inversion : a = %d, b = %d\n", a, b);
        
        // 
        sc.close();
    }
}

