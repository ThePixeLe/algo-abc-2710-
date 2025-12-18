import java.util.*;

public class exo_2_1 {
    public static void main(String [] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Comparaison de nombres");

        System.out.println("Quel est votre age ?");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Vous n'etes pas encore né");
        } else if ( age < 18)
            System.out.println("Vous etes mineur");
            else { 
                System.out.println("Vous etes majeur");

            }


        System.out.println("");

        sc.close();
    }
    
}
