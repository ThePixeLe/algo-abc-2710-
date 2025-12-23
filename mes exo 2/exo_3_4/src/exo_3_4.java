/*
//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class SearchNumber {

    public static void main(String[] args) throws Exception {

        int nbcase;
        Scanner sc = new Scanner(System.in);

        int saisieU;
        System.out.println("Combien de valeur voulez saisir dans un tableau :?");
        nbcase = sc.nextInt();

        int[] monTab = new int[nbcase];
        int[] occurence = new int[nbcase];
        String chaineVal = "";
        Random monAlea = new Random();
        String chaineVal2 = "";
        for (int i = 0; i < monTab.length; i++) {
            monTab[i] = monAlea.nextInt(101);
        }

        Arrays.sort(monTab);

        System.out.print("[");
        for (int el : monTab) {

            System.out.print(el + " ");

        }

        System.out.println("]");
        System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
        saisieU = sc.nextInt();

        boolean trouve = false;
        // int position = 0;
        int numOcurrence = 0;

        for (int i = 0; i < monTab.length; i++) {
            if (monTab[i] == saisieU) {

                trouve = true;

                occurence[numOcurrence] = i + 1;
                numOcurrence++;

            }

        }

        if (!trouve) {
            System.out.println(" Le nombre saisie n'est pas dans la tableau !");
        } else {

            for (int position : occurence) {

                if (position != 0) {
                    chaineVal += position + ", ";
                }

            }

            for (int position : occurence) {

                if (position == 0) {
                    continue;
                } else {
                    chaineVal2 += position + ", ";
                }

            }

            String souString = chaineVal.substring(0, chaineVal.length() - 2);
            String souString2 = chaineVal2.substring(0, chaineVal2.length() - 2);
            System.out.println("version avec Continue :" + souString2);
            System.out.print("Le nombre se trouve dans le tableau à la (aux) position(s)  :" + souString);

        }

        sc.close();
    }

}
  */


/*// 1. Initialisation
Déclarer un tableau de caractères : chaine[]
Lire la valeur de chaine (par exemple, "bonjour.")
Lire la lettre_cherchee

// 2. Gestion du cas particulier : chaîne vide ?
// Vérifier si le premier élément du tableau est déjà le point.
SI chaine[0] EST ÉGAL à "." ALORS
    Afficher "LA CHAINE EST VIDE"
    Arrêter le programme
FIN SI

// 3. Initialisation des variables pour la boucle
Initialiser compteur à 0
Initialiser index à 0 // On commence au premier élément du tableau (index 0)

// 4. Boucle de parcours du tableau
TANT QUE chaine[index] N'EST PAS ÉGAL à "."
    FAIRE:
        SI chaine[index] EST ÉGAL à lettre_cherchee
        ALORS
            compteur = compteur + 1
        FIN SI

        index = index + 1 // On passe à l'élément suivant du tableau
FIN TANT QUE

// 5. Affichage du résultat
Afficher "La lettre '" + lettre_cherchee + "' apparaît " + compteur + " fois."
 */

/*En résumé, pour écrire cela en Java
 import java.util.Scanner;
Une variable String chaine.
Une variable char lettreCherchee.
Une variable int compteur = 0.
Une variable int index = 0.
Une condition if pour le cas "chaîne vide".
Une boucle while avec une condition combinée (index < chaine.length() && chaine.charAt(index) != '.').
À l'intérieur de la boucle, un if qui utilise == pour comparer les char.*/




import java.util.*;

public class exo_3_4 {
    public static void main(String [] args) throws Exception {


        int index = 0;
        Scanner sc = new Scanner(System.in);

        String chaine;
        System.out.println("Entre moi une chaine de caractere qui ce termine par le caractere '.'");
        chaine = sc.nextLine();

        int compteur = 0;

        if (chaine [] "est egal a '.'") {
            System.out.println("la chaine est vide" );
        }

     

        sc.close();
    }

}
