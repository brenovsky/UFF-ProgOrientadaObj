package listas.lista01;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.err.println("Discriminante negativo");
            System.exit(-1);
        }

        double x1, x2;

        if (delta == 0) {
            x1 = -b / (2.0 * a);
            x2 = x1;
        }

        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }

        System.out.printf("(%.2f, %.2f)%n", x1, x2);

        sc.close();
    }
}