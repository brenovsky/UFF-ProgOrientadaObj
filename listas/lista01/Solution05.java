package listas.lista01;


public class Solution05 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.printf("%d x %d = %d\n", a, b, a * b);
            }
            System.out.println("=============");
        }
    }
}