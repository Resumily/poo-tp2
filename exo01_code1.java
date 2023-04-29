public class exo01_code1 {

  public static void main(String[] args) {

    int n = 0, k = 1;
    do {
      if (n % 2 == 0) {
        System.out.println(n + " est pair");
        n += 3;
        continue;
      }
      if (n % 3 == 0) {
        System.out.println(n + " est multiple de 3");
        n += 5;
      }
      if (n % 5 == 0) {
        System.out.println(n + " est multiple de 5\n");
        break;
      }
      n += 1;
    } while (k == 1);
    System.out.println("La valeur finale de n à la sortie de la boucle est " + n);
  }
}
