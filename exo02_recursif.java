import java.util.Scanner;

public class exo02_recursif {
   public static void main(String[] args) {
      
      int n;
      Scanner sc = new Scanner(System.in);
      
      do {
         System.out.print("Entrez un nombre entier supérieur à 2 : ");
         n = sc.nextInt();
      } while (n <= 2);

      int n3 = fib(n);
      
      System.out.println("La " + n + "ème valeur de la suite de Fibonacci est : " + n3);
   }
   
   public static int fib(int n) {
      if (n < 2) {
         return 1;
      } else {
         return fib(n-1) + fib(n-2);
      }
   }
}

