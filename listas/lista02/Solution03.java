package listas.lista02;
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] v = new int[n];

        System.out.println("Enter items:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();
        System.out.println("Enter p:");
        int p = sc.nextInt();

        if ((p > n - 1) || (p < 0))  {
            System.err.println("Posição inválida");
            System.exit(-1);
        }

        int temp;
        for (int i = 0; i <= p; i++) {
            if (i == p) {
                for (int j = p; j < n; j++) {
                    temp = v[j];
                    v[j] = k;
                    k = temp;
                }
            }
        }

        for (int numero : v) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}
