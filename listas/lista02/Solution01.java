package listas.lista02;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        float[] notasTurma = new float[n];
        float somaMedia = 0;
        float mediaTurma;

        for (int i = 0; i < n; i++) {
            float nota = sc.nextFloat();
            notasTurma[i] = nota;
            somaMedia += nota;
        }

        mediaTurma = somaMedia / n;
        System.out.printf("Media: %.2f%n", mediaTurma);

        for (float item : notasTurma) {
            if (item >= mediaTurma) {
                System.out.println(item);
            }
        }

        sc.close();

    }
}
