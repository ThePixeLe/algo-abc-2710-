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

import java.util.Scanner; /*Importation de la bibliothèque Java Scanner */

public class exo7switchexperience  { /* Nom de la classe */

  public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

    /*** -------- Début du code ------------------- ****/

    Scanner sc = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner

    // Poser la question à l'utilisateur
    System.out.print("Do you speak english (Y/N)? ");

    // Lire la réponse et la convertir en majuscules sans espaces
    String reponse = sc.nextLine().trim().toUpperCase();

    // Vérifier si le résultat de la question avec switch (syntaxe classique)
    switch (reponse) {
      case "Y":
        System.out.println("Nice to meet you"); // Si réponse est Y
        break;
      case "N":
        System.out.println("So learn english !"); // Si réponse est N
        break;
      default:
        System.out.println("Tu n as pas repondu a la question"); // Autre réponse
        break;
    }

    sc.close(); // Fermeture du Scanner
  }
}
