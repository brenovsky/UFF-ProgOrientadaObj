package listas.lista01;
import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int last = 1;
        int temp;

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", first);

            temp = first;
            first = last;
            last = first + temp;
        }
    }
}