/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/

import java.util.Scanner; /*Importation de la bibliothèque Java Scanner */

public class exo8 {  /* Nom de la classe */
       
    public static void main (String [] args) {  /* Toujours le mettre pour tester votre code */
      
         /*** -------- Début du code ------------------- ****/

         Scanner sc = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner


         // Poser les questions à l'utilisateur

         System.out.print("Vueillez renseignez votre prenom ?");

         System.out.print(" Vueillez renseignez votre nom ?");

         System.out.print(" Vueillez renseignez votre adresse email ?");

         System.out.print(" Vueillez renseignez votre mot de passe ?");

         System.out.print(" Vueillez confirmez votre mot de passe");

         // Lire la réponse et la convertir en majuscules sans espaces

         String reponse = sc.nextLine().trim();

         // Vérifier  le résultat de la question

         if (reponse.equalsIgnoreCase(reponse)) {
            System.out.println("inscription annulée");
         } else  {
            System.out.println("Merci votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse :");
         }


    sc.close();  /* Fermez vos scanner à la fin */
    }
}

