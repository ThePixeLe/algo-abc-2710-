/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */

import java.util.Scanner;

public class exo2  {
  public static void main(String[] args ) {
   Scanner sc = new Scanner(System.in);
   int a;
   int b;
   int resultat;

   System.out.print("a ="); 
   a = sc.nextInt();

   System.out.print("b =");
   b = sc.nextInt();

   System.out.println();

   resultat = a - b;

   System.out.println("resultat = a - b");
   System.out.println();
   System.out.println("resultat vaut" +resultat);

    sc.close();
  }
}