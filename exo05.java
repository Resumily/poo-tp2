import java.util.Scanner;

public class exo05 {
    
    public static double operation(double x, double y, char op) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                return x + y;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez x : ");
        double x = sc.nextDouble();
        System.out.print("Entrez y : ");
        double y = sc.nextDouble();
        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char op = sc.next().charAt(0);
        double result = operation(x, y, op);
        System.out.println(x + " " + op + " " + y + " = " + result);
        sc.close();
    }
}

