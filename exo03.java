import java.util.Arrays;
import java.util.Scanner;

public class exo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande la taille des tableaux à l'utilisateur
        int taille;
        do {
            System.out.print("Entrez la taille des tableaux : ");
            taille = sc.nextInt();
        } while (taille <= 0);

        // Alloue de la mémoire pour les trois tableaux
        int[] t1 = new int[taille];
        int[] t2 = new int[taille];
        int[] t3 = new int[taille];

        // Remplit t1 avec les valeurs saisies par l'utilisateur
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez la valeur " + (i+1) + " : ");
            t1[i] = sc.nextInt();
        }

        // Calcule les carrés des nombres dans t1 et les place dans t2
        for (int i = 0; i < taille; i++) {
            t2[i] = t1[i] * t1[i];
        }

        // Affiche les carrés dans t2 en utilisant la boucle for-each
        System.out.print("Les carrés des valeurs dans t1 sont : ");
        for (int val : t2) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Remplit t3 avec des valeurs aléatoires entre 5 et 99
        for (int i = 0; i < taille; i++) {
            t3[i] = (int) (Math.random() * 95) + 5;
        }

        // Trie les éléments de t3 dans l'ordre croissant
        Arrays.sort(t3);

        // Affiche les valeurs dans t3 en utilisant la boucle for-each
        System.out.print("Les valeurs dans t3 triées dans l'ordre croissant sont : ");
        for (int val : t3) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Affiche la valeur maximale de t3 en utilisant la méthode max de la classe Arrays
        int max = Arrays.stream(t3).max().getAsInt();
        System.out.println("La valeur maximale de t3 est : " + max);

        // Affiche la valeur minimale de t3 en utilisant la méthode min de la classe Arrays
        int min = Arrays.stream(t3).min().getAsInt();
        System.out.println("La valeur minimale de t3 est : " + min);

        sc.close(); // Fermer le scanner et libérer les ressources associées à ce scanner.


    }
}
