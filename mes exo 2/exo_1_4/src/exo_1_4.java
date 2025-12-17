import java.util.*;

public class exo_1_4 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        
        System.out.println(" CALCUL D'INTÉRÊTS SIMPLES ET COMPOSÉS");
        
        
        // LECTURE des paramètres financiers

        System.out.print("Somme initiale investie : ");
        double somme = sc.nextDouble();
        
        System.out.print("Taux d'intérêt annuel (ex: 0.05 pour 5%) : ");
        double taux = sc.nextDouble();
        
        System.out.print("Nombre d'années de placement : ");
        int annees = sc.nextInt();
        
        //  INTÉRÊT SIMPLE : croissance linéaire
        // Formule : S(1 + N×i) - les intérêts ne rapportent pas d'intérêts

        double interetSimple = somme * (1 + annees * taux);
        
        //  INTÉRÊT COMPOSÉ : croissance exponentielle 
        // Formule : S(1 + i)^N - les intérêts rapportent des intérêts

        double interetCompose = somme * Math.pow(1 + taux, annees);
        
        //  AFFICHAGE COMPARATIF
        System.out.printf("\n RÉSULTATS après %d années à %.2f%% :\n", annees, taux * 100);
        System.out.printf("Avec intérêt simple  : %f €\n", interetSimple);
        System.out.printf("Avec intérêt composé : %f €\n", interetCompose);
        System.out.printf("Différence (composé - simple) : %f €\n", interetCompose - interetSimple);
        
        // BONNE PRATIQUE : fermer le scanner pour libérer les ressources

        sc.close();
    }
}

