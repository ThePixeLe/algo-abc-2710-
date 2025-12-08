/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 *  
*/

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class exo4 {  /* Nom de la classe */

    public static void main (String [] args  ) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/

        Scanner sc = new Scanner(System.in);  // Déclaration du scanner Instance de l'Objet Scanner


        int a;
        int b;
        int resultat;

          // Lire les valeurs de a et b
          System.out.print("a =");
          a = sc.nextInt();
        
          System.out.print("b =");
          b = sc.nextInt();

          System.out.println(); 
          

          // Calculer le résultat de la division 

          resultat = a / b;

           // Afficher le résultat de la division

           System.out.println("resultat = a / b");
           System.out.println();
           System.out.println("resultat = " +resultat);

           // Vérifier si le résultat est divisible par 2 condition

           if (resultat % 2 == 0 ) {
               System.out.println("Le nombre est divisible par 2");
           } else {
                System.out.print("Le nombre n'est pas divisible par 2");
           }



        sc.close();
    }
}




