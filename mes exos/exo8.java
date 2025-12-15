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

// pseudo code : 
// Importation de la bibliothèque Java Scanner
//  Nom de la classe
// Déclaration du scanner Instance de l'Objet Scanner
// demander le prenom --> stocker dans une variable
// demander le nom    ---> stocker dans une variable
// demander le mail --> stocker dans une variable
// demander le mot de passe --> stocker dans une variable
// demander la confirmation du mot de passe --> stocker dans une variable 
// lire les reponse 
//puis verifier les variables du mot de passe avec une condition if / else 
// si reponse exact repondre  Merci ******* , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : *******@arfp.asso.fr
//sinon  repondre inscription annulée
// Fin si
// Scanner fermer



import java.util.Scanner; /*Importation de la bibliothèque Java Scanner */

public class exo8 {  /* Nom de la classe */
       
    public static void main (String [] args) {  /* Toujours le mettre pour tester votre code */
      
         /*** -------- Début du code ------------------- ****/

         Scanner sc = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner


         // Poser les questions à l'utilisateur et lire les valeurs

         System.out.print("Vueillez renseignez votre prenom ?");
         String prenom = sc.nextLine();

         System.out.print(" Vueillez renseignez votre nom ?");
         String nom = sc.nextLine();

         System.out.print(" Vueillez renseignez votre adresse email ?");
         String adresseEmail = sc.nextLine();

         System.out.print(" Vueillez renseignez votre mot de passe ?");
         String motDePasse = sc.nextLine();

         System.out.print(" Vueillez confirmez votre mot de passe");
         String confirmationMotDePasse = sc.nextLine();

         // Lire la réponse et afficher les valeurs

         String prenom = "";
         System.out.println("Bonjour" + prenom);

        
         

         // Vérifier  le résultat de la question

         if (motDePasse.equals(confirmationMotDePasse)) {
            System.out.println("Merci votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse :");
         } else  {
            System.out.println("inscription annulée");
         }


    sc.close();  /* Fermez vos scanner à la fin */
    }
}

