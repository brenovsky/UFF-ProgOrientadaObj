package listas.lista02;
import java.util.Scanner;

public class Solution02 {
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

        for (int i = 0; i < n; i++) {
            if (k == v[i]) {
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }
}
