import java.util.*;

public class exo_2_2 {
    public static void main(String [] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tri de nombres");
       
        System.out.println("Vueillez entrez le premier valeur : ");
        int a = sc.nextInt();

         System.out.print("Vueillez Entrez la deuxième valeur : ");
        int b = sc.nextInt();


        if (a < b) {
            System.out.println("Le chiffre est plus grand que :");
        }

        sc.close();
    }

}
