import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // Déclaration du scanner Instance de l'Objet Scanner

       double var1; // le rayon de la sphere
       double var2; // pi donnée nécessaire
       double resultat;

       System.out.println("Veuillez saisir le rayon de la sphere");
       var1= sc.nextDouble();

       System.out.println("Veuilliez saisir pi");
       var2= sc.nextDouble();
       

       resultat= 4* var2 * var1 * var1; 

       System.out.println("L aire de la sphere est de :" + Math.round(resultat));

     sc.close();

    }
}
