/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class exo3 { /* Nom de la classe */

    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/
        Scanner sc = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner
        int a;
        int b;
        int resultat;

        // Lire les valeurs de a et b

        System.out.print("a = ");
        a = sc.nextInt();


        System.out.print("b = ");
        b = sc.nextInt();

        System.out.println();

        // Calculer le résultat de l'addition

        resultat = a + b;

        // Afficher le résultat de l'addition

        System.out.println("resultat = a + b");
        System.out.println();
        System.out.println("resultat = " + resultat);

        // Vérifier si le résultat est pair ou impair

        if (resultat % 2 == 0) {
            System.out.println ("Le nombre est pair");
        } else {
            System.out.print("Le nombre est impair");
        }

        sc.close();


    }
}