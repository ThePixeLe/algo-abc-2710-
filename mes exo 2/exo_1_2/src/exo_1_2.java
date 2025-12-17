import java.util.*; //  Importation de la "boîte à outils" Java

public class exo_1_2 {

    //POINT DE DÉPART : chaque programme Java commence par main()
    public static void main(String[] args) throws Exception { 

       // Création d'un scanner - notre "oreille numérique" pour écouter l'utilisateur 
       Scanner sc = new Scanner(System.in); 
       
       // DÉCLARATION des variables - comme des étiquettes sur des boîtes vides

       double rayon; // Distance du centre à la surface
       double aire;     // Surface totale de la sphère
       double volume;   // Espace intérieur 3D

       System.out.print("Calcul de l'aire et le volume d'une sphere");
       System.out.print("Veuillez saisir le rayon de la sphere : ");

       // PAUSE : le programme attend que l'utilisateur tape un nombre
       rayon = sc.nextDouble();

       // CALCUL DE L'AIRE : formule 4PIR²
       // Math.PI ≈ 3.14159 - constante précise fournie par Java
       // Math.pow(rayon, 2) = rayon × rayon (méthode plus précise)
       aire = 4 * Math.PI * Math.pow(rayon, 2);

       // CALCUL DU VOLUME : formule (4/3)PIR³
       // CRUCIAL : (4.0/3.0) et non (4/3) pour éviter la division entière
       volume = (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);

       // AFFICHAGE avec printf - formatage professionnel
       // %f = remplace par un nombre décimal, \n = saut de ligne
       System.out.printf("la surface de la sphere est : %f km2\n", aire);
       System.out.printf("son volume est de : %f km3\n", volume);

       

       sc.close(); // Fermeture du scanner
    }
}
