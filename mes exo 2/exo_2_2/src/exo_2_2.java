import java.util.*;

public class exo_2_2 {
    public static void main(String [] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tri de nombres");
       
        System.out.println("Vueillez entrez le premier nombre : ");
        int a = sc.nextInt();

         System.out.print("Vueillez Entrez le deuxième nombre : ");
        int b = sc.nextInt();


        if (a < b) {
            System.out.printf("Ordre croissant : %d puis %d\n", a, b);
        } else {
            System.out.printf("Ordre croissant : %d puis %d\n", b, a);
        }

        sc.close();
    }

}
