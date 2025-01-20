package listas.lista03;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int largura = sc.nextInt();
        int altura = sc.nextInt();

        Retangulo01 r1 = new Retangulo01(x, y, largura, altura);

        r1.Desenhar();
        r1.Mover(5, 3);
        r1.Redimensionar(100, 200);

        r1.Desenhar();

        sc.close();
    }
}
