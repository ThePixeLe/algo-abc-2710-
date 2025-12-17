import java.util.*;

public class Exercice1_3_SecteurCirculaire {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        
        System.out.println(" CALCUL DE LA SURFACE D'UN SECTEUR CIRCULAIRE");
        System.out.println("(Comme calculer la part d'une pizza!)");
        
        //  LECTURE des dimensions
        System.out.print("Rayon du cercle : ");
        double rayon = sc.nextDouble();
        
        System.out.print("Angle du secteur (en degrés) : ");
        double angle = sc.nextDouble();
        
        // CALCUL selon la formule : (πR² × angle) / 360
        // Explication : aire_complete × (angle/360) = aire_secteur
        double aireSecteur = (Math.PI * Math.pow(rayon, 2) * angle) / 360.0;
        
        //  AFFICHAGE avec explication
        System.out.printf("Pour un cercle de rayon %f et un angle de %f° :\n", rayon, angle);
        System.out.printf("L'aire du secteur circulaire est : %f unités²\n", aireSecteur);


        //BONNE PRATIQUE : fermer le scanner pour libérer les ressources
        
        sc.close(); 
    }
}

