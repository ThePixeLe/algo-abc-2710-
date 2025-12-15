import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double var1;
        double var2;
        double var3;
        double resultat;

        System.out.println("Veuilliez saisir la fraction constante");
        var1= sc.nextDouble();

        System.out.println("Veuilliez saisir pi");
        var2= sc.nextDouble();

        System.out.println("Veuillez saisir le rayon de la sphere");
        var3= sc.nextDouble();

        resultat= var1 * var2 * var3 * var3 * var3;
        
     System.out.println("Le volume de la sphere est de :" + Math.round(resultat));

     sc.close();
    }
}
