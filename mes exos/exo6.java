/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/

import java.util.Scanner;  /* Importation de la bibliothèque Java Scanner */

public class exo6 {  /* Nom de la classe */

    public static void main (String [] args ) {  /* Toujours le mettre pour tester votre code */


         /***--------  Début du code  -------------------****/

         Scanner sc = new Scanner(System.in);   // Déclaration du scanner Instance de l'Objet Scanner
           
        String  prenom; 
        int age;
       

        // Lire les valeurs

        System.out.print("Quel est ton prenom");
        prenom = sc.nextLine();
         
        System.out.print("Quel est ton age");
        age = sc.nextInt(); 

         // Afficher le résultat

          System.out.println("\n Bonjour je m'appelle"  + prenom +  ", j'ai " + age +   " ans ");


      sc.close(); // Fermeture du Scanner

    }
}
