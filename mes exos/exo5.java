/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser par C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/



import java.util.Scanner;  /* Importation de la bibliothèque Java Scanner */

public class exo5 {   /* Nom de la classe */

    public static void main (String [] args ) { /* Toujours le mettre pour tester votre code */

         /***--------  Début du code  -------------------****/

         Scanner sc = new Scanner(System.in);   // Déclaration du scanner Instance de l'Objet Scanner

         int a;
         int b;
         int c;
         int resultat;

          // Lire les valeurs de a , b et c

          System.out.print("a =");
          a = sc.nextInt();

          System.out.print("b =");
          b = sc.nextInt();

          System.out.print("c =");
          c = sc.nextInt();
        
          System.out.println();

           // Calculer le résultat de l'equation

           resultat =  (a * b)  / c;

           
         // Afficher le résultat de l'equation
         
         System.out.println("resultat = (a * b) / c");
         System.out.println();
         System.out.println("resultat = " +resultat);

          // Vérifier si le résultat est inferieur ou superieur a 10

          if (resultat  < 10 ) {
            System.out.println("Le nombre est inferieur a 10");
          } else {
            System.out.print("Le nombre est superieur a 10 ");
          }

          sc.close();

    }
}