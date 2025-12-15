/*import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double var1;
        double var2;
        double var3;
        double resultat;

        System.out.println("Veuilliez saisir la fraction constante");
        var1= sc.nextDouble();

        System.out.println("Veuilliez saisir pi");
        var2= sc.nextDouble();

        System.out.println("Veuillez saisir le rayon de la sphere");
        var3= sc.nextDouble();

        resultat= var1 * var2 * var3 * var3 * var3;
        
     System.out.println("Le volume de la sphere est de :" + Math.round(resultat));

     sc.close();
    }
}*/


// correction du code 

import java.util.Scanner;

/**
 * EXERCICE 1.2 - PARTIE 2 : CALCUL DU VOLUME D'UNE SPHÈRE
 * Formule : Volume = (4/3) × π × R³
 */
public class exo_Volume {

    public static void main(String[] args) {
        // 🔹 ÉTAPE 1: Créer le scanner pour lire le clavier
        Scanner sc = new Scanner(System.in);
        
        // 🔹 ÉTAPE 2: Déclarer nos variables
        double rayon;    // Le rayon que l'utilisateur va taper
        double volume;   // Le résultat du calcul du volume
        final double PI = Math.PI; // π constant (≈3.14159)
        
        // 🔹 ÉTAPE 3: Afficher le titre du programme
        System.out.println("==================================");
        System.out.println("CALCUL DU VOLUME D'UNE SPHÈRE");
        System.out.println("Formule : Volume = (4/3) × π × R³");
        System.out.println("==================================");
        
        // 🔹 ÉTAPE 4: Demander et lire le rayon
        System.out.print("Entrez le rayon R de la sphère : ");
        rayon = sc.nextDouble();
        
        // 🔹 ÉTAPE 5: Vérifier que le rayon est positif
        if (rayon < 0) {
            System.out.println("❌ ERREUR : Le rayon ne peut pas être négatif !");
            sc.close();
            return; // Arrêter le programme
        }
        
        // 🔹 ÉTAPE 6: CALCULER LE VOLUME
        // IMPORTANT : (4.0/3.0) et pas (4/3) pour avoir des décimaux
        // Formule : Volume = (4/3) × π × R × R × R
        volume = (4.0 / 3.0) * PI * rayon * rayon * rayon;
        
        // 🔹 ÉTAPE 7: AFFICHER LE RÉSULTAT
        System.out.println("\n--- RÉSULTAT ---");
        System.out.printf("Rayon de la sphère : %.2f unités%n", rayon);
        System.out.printf("VOLUME calculé     : %.2f unités³%n", volume);
        
        // 🔹 ÉTAPE 8: Fermer le scanner
        sc.close();
        
        System.out.println("\n✅ Calcul du volume terminé !");
    }
}


