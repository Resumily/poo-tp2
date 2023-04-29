public class exo04 {
    public static void main(String[] args) {
        int[] occurrences = new int[11];

        for (int i = 0; i < 70000; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2 - 2;

            occurrences[sum]++;
        }

        for (int i = 0; i < occurrences.length; i++) {
            int sum = i + 2;
            System.out.println("Somme " + sum + " : " + occurrences[i] + " occurrences");
        }

        int maxOccurrences = 0;
        int maxSum = 0;
        for (int i = 0; i < occurrences.length; i++) {
            int sum = i + 2;
            if (occurrences[i] > maxOccurrences) {
                maxOccurrences = occurrences[i];
                maxSum = sum;
            }
        }

        System.out.println("La somme la plus fréquente est " + maxSum + " avec " + maxOccurrences + " occurrences.");
    }
}
