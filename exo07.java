import java.util.Scanner;

public class exo07 {
    
    // Question 1
    public static void affseq(int n) {
        if (n == 0) {
            System.out.print(n);
            return;
        }
        affseq(n - 1);
        System.out.print("," + n);
    }
    
    // Question 2
    public static void affseqInv(int n) {
        if (n == 0) {
            System.out.print(n);
            return;
        }
        System.out.print(n + ",");
        affseqInv(n - 1);
    }
    
    // Question 3
    public static int somme_un_a(int n) {
        if (n == 1) {
            return 1;
        }
        return n + somme_un_a(n - 1);
    }
    
    // Question 4
    public static int facto(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }
    
    // Fonction main pour tester les différentes fonctions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();
        
        System.out.println("Question 1 :");
        affseq(n);
        
        System.out.println("\nQuestion 2 :");
        affseqInv(n);
        
        System.out.println("\nQuestion 3 :");
        int sum = somme_un_a(n);
        System.out.println("Somme de 1 à "+n+" : " + sum);
        
        System.out.println("\nQuestion 4 :");
        System.out.print("Entrez un entier n : ");
        n = sc.nextInt();
        int fact = facto(n);
        System.out.println("Factorielle de "+n+" : " + fact);
    }
}
