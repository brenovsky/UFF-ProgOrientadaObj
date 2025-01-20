package listas.lista03;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int r = sc.nextInt();

        Circulo02 c1 = new Circulo02(x, y, r);

        c1.Desenhar();
        c1.Mover(5, 3);
        c1.Redimensionar(100);
        c1.Desenhar();

        c1.CalcularPerimetro();
        c1.CalcularArea();

        sc.close();
    }
}
