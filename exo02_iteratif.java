import java.util.Scanner;

public class exo02_iteratif {
   public static void main(String[] args) {
      
      int n, n1 = 1, n2 = 1, n3 = 0;
      Scanner sc = new Scanner(System.in);
      
      do {
         System.out.print("Entrez un nombre entier supérieur à 2 : ");
         n = sc.nextInt();
      } while (n <= 2);

      for (int i = 2; i <= n; i++) {
         n3 = n1 + n2;
         n1 = n2;
         n2 = n3;
      }
      
      System.out.println("La " + n + "ème valeur de la suite de Fibonacci est : " + n3);
   }
}

