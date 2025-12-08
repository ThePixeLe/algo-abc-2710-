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

import java.util.Scanner;    /* Importation de la bibliothèque Java Scanner */

public class exo7 {

    

   public static void main (String [] args ) { /* Toujours le mettre pour tester votre code */

     /***--------  Début du code  -------------------****/

     Scanner sc = new Scanner (System.in);  // Déclaration du scanner Instance de l'Objet Scanner

  
       // Afficher la question
        System.out.println("Do you speak english (Y/N)?");
        
        // Lire la réponse
        String reponse = sc.nextLine();

   // Afficher la question
        System.out.println("Do you speak english (Y/N)?");
        
         // Vérifier la réponse et afficher le message
        if (reponse.equalsIgnoreCase("Y")) {
            System.out.println("\"Nice to meet you\"");
        } else {
            System.out.println("\"So learn english !\"");
        }
    
    }   
 }