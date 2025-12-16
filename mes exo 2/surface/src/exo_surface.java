import java.util.Scanner; 


public class exo_surface {
    public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner(System.in);

         double PI = Math.PI;
         double rayon;
         double angle;

         System.out.println("==================================");
         System.out.println("CALCUL DE LA SURFACE D'UN SECTEUR CIRCULAIRE");
         System.out.println("Formule : Surface = Math.PI*Math.pow(rayon,:2)*angle/360");
         System.out.println("==================================");


         System.out.print("Entrez le rayon : ");
         rayon = sc.nextDouble();

          if (rayon < 0) {
            System.out.println(" ERREUR : Le rayon ne peut pas être négatif !");
            sc.close();
            return; 
        }

        l aire du secteur circulaire = Math.PI * Math.pow(rayon,2) * angle /360;


        System.out.println("\n--- RÉSULTAT ---");
        System.out.printf("Aire du secteur circulaire: %.2f unités%n", rayon);

         


         sc.close();


          System.out.println("\n Calcul de la surface terminé !");
    }
}
