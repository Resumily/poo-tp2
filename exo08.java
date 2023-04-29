import java.util.Scanner;

public class exo08 {
    
    /**
     * Méthode de construction du triangle supposant la structure mémoire existante
     * @param triangle Tableau des coefficients
     */
    public static void construitTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
    }
    
    /**
     * Méthode d'initialisation de la hauteur du triangle uniquement (nb de lignes)
     * @param nbNiveaux Indique le nombre de lignes utilisées
     * @return La matrice de coefficients initialisée en hauteur uniquement
     */
    public static int[][] creer_HauteurTriangle(int nbNiveaux) {
        if (nbNiveaux <= 0) {
            System.out.println("Nombre de niveaux non valide, initialisation à 6 niveaux.");
            nbNiveaux = 6;
        }
        int[][] triangle = new int[nbNiveaux][];
        for (int i = 0; i < nbNiveaux; i++) {
            triangle[i] = new int[i+1];
        }
        return triangle;
    }
    
    /**
     * Méthode pour afficher le triangle de Pascal
     * @param triangle Tableau des coefficients
     */
    public static void afficheTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Fonction principale
     * @param args Les arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre de niveaux : ");
        int nbNiveaux = input.nextInt();
        int[][] triangle = creer_HauteurTriangle(nbNiveaux);
        construitTriangle(triangle);
        afficheTriangle(triangle);
    }
}

