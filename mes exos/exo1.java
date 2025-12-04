/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int resultat;
        
        // Lire les valeurs de a et b
        System.out.print("a = ");
        a = sc.nextInt();
        
        System.out.print("b = ");
        b = sc.nextInt();
        
        System.out.println();
        
        // Calculer l'addition
        resultat = a + b;
        
        // Afficher le résultat
        System.out.println("resultat = a + b");
        System.out.println();
        System.out.println("resulat vaut " + resultat);
        
        sc.close();
    }
}

