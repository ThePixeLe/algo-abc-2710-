import java.util.*;

public class exo_1 {
    public static void main(String [] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tri de nombre ");

        System.out.println("Entrez la premiere valeur ");
        boolean a = sc.nextBoolean();

        System.out.println("Entrez la deuxieme  valeur ");
         boolean b = sc.nextBoolean();

        System.out.println("Entrez la troisieme  valeur ");
        boolean c = sc.nextBoolean();

        if ( a == true ) {
            System.out.printBoolean( " votre premiere valeur est vrai",b);

        } else if ( b == true) {
              System.out.print( " votre deuxieme valeur est vrai",a);
        } 
        else if ( c == false) {
             System.out.print( " votre troisiem valeur est fausse",c);
        }
          else {
            System.out.println( " Resulta de sortie");
          }


        sc.close();
    }

}