package listas.lista01;
import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double preco = sc.nextDouble();
        int quantidade = sc.nextInt();

        double valorTotal;

        if (quantidade <= 10) {
            valorTotal = preco * quantidade;
        }

        else if (quantidade <= 20) {
            valorTotal = 0.9 * (preco * quantidade);
        }

        else if (quantidade <= 50) {
            valorTotal = 0.8 * (preco * quantidade);
        }

        else {
            valorTotal = 0.75 * (preco * quantidade);
        }

        System.out.printf("Nome: %s\nPreco: %.2f\nQuantidade: %d\n", nome, preco, quantidade);
        System.out.printf("Total: %.2f", valorTotal);

        sc.close();
    }
}