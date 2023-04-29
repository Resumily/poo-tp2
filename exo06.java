import java.util.Scanner;

public class exo06 {

    public static boolean premierTest(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void chercherNbPremier(int n) {
        for (int i = 2; i <= n; i++) {
            if (premierTest(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une valeur pour n: ");
        int n = sc.nextInt();
	if (premierTest(n)==true) System.out.println("Le nombre est premier");
	else System.out.println("Le nombre n'est pas premier");
	System.out.println("La liste des nombres premiers jusqu'à "+n+" : ");
        long start = System.currentTimeMillis();
        chercherNbPremier(n);
        long end = System.currentTimeMillis();

        double timeElapsed = (end - start) / 1000.0;
        System.out.printf("Temps d'execution: %.5f secondes\n", timeElapsed);
    }
}
