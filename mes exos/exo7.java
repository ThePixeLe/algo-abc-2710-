/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/

import java.util.Scanner;     /*Importation de la bibliothèque Java Scanner */

public class exo7 {    /* Nom de la classe */
      
    public static void main (String [] args ) {    /*Toujours le mettre pour tester votre code */

     /***--------  Début du code  -------------------****/

      Scanner sc = new Scanner(System.in);      // Déclaration du scanner Instance de l'Objet Scanner

     boolean y;
     boolean n;
     String reponse;

         // Lire les variables

         System.out.print("y =");
         y = sc.nextBoolean();


         System.out.print("n");
         n = sc.nextBoolean();

         System.out.print("Tu n as pas repondu a la question");
         reponse = sc.nextLine();

     

       // Vérifier si le résultat de la question

       if (y) {
        System.out.println("Nice to meet you");
       } else if (n) {
        System.out.println("So learn english !");
       } else (reponse) {
        System.out.println("Tu n as pas repondu a la question");
       }



        sc.close();// Fermeture du Scanner
    }
}
