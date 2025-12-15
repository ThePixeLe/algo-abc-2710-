/*import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // Déclaration du scanner Instance de l'Objet Scanner

       double var1; // le rayon de la sphere
       double var2; // pi donnée nécessaire
       double resultat;

       System.out.println("Veuillez saisir le rayon de la sphere");
       var1= sc.nextDouble();

       System.out.println("Veuilliez saisir pi");
       var2= sc.nextDouble();
       

       resultat= 4* var2 * var1 * var1; 

       System.out.println("L aire de la sphere est de :" + Math.round(resultat));

     sc.close();

    }
}*/


// correction du code 

import java.util.Scanner;

/**
 * EXERCICE 1.2 - PARTIE 1 : CALCUL DE L'AIRE D'UNE SPHÈRE
 * Formule : Aire = 4 × π × R²
 */
public class exo_aire {

    public static void main(String[] args) {
        // 🔹 ÉTAPE 1: Créer le scanner pour lire le clavier
        Scanner sc = new Scanner(System.in);
        
        // 🔹 ÉTAPE 2: Déclarer nos variables
        double rayon;    // Le rayon que l'utilisateur va taper
        double aire;     // Le résultat du calcul de l'aire
        final double PI = Math.PI; // π constant (≈3.14159)
        
        // 🔹 ÉTAPE 3: Afficher le titre du programme
        System.out.println("================================");
        System.out.println("CALCUL DE L'AIRE D'UNE SPHÈRE");
        System.out.println("Formule : Aire = 4 × π × R²");
        System.out.println("================================");
        
        // 🔹 ÉTAPE 4: Demander et lire le rayon
        System.out.print("Entrez le rayon R de la sphère : ");
        rayon = sc.nextDouble();
        
        // 🔹 ÉTAPE 5: Vérifier que le rayon est positif
        if (rayon < 0) {
            System.out.println("❌ ERREUR : Le rayon ne peut pas être négatif !");
            sc.close();
            return; // Arrêter le programme
        }
        
        // 🔹 ÉTAPE 6: CALCULER L'AIRE
        // Formule : Aire = 4 × π × R × R
        aire = 4 * PI * rayon * rayon;
        
        // 🔹 ÉTAPE 7: AFFICHER LE RÉSULTAT
        System.out.println("\n--- RÉSULTAT ---");
        System.out.printf("Rayon de la sphère : %.2f unités%n", rayon);
        System.out.printf("AIRE calculée      : %.2f unités²%n", aire);
        
        // 🔹 ÉTAPE 8: Fermer le scanner
        sc.close();
        
        System.out.println("\n✅ Calcul de l'aire terminé !");
    }
}
