package listas.lista03;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        boolean run = true;
        int option;
        int n;

        Scanner sc = new Scanner(System.in);
        while (run) {

            Calculadora03.MostrarMemoria();
            Calculadora03.MostrarMenu();

            option = sc.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Insira o numero");
                    n = sc.nextInt();
                    Calculadora03.Somar(n);
                    break;
                case 2:
                    System.out.println("Insira o numero");
                    n = sc.nextInt();
                    Calculadora03.Subtrair(n);
                    break;
                case 3:
                    System.out.println("Insira o numero");
                    n = sc.nextInt();
                    Calculadora03.Multiplicar(n);
                    break;
                case 4:
                    System.out.println("Insira o numero");
                    n = sc.nextInt();
                    Calculadora03.Dividir(n);
                    break;
                case 5:
                    Calculadora03.LimparMemoria();
                    break;
                case 6:
                    Calculadora03.SairDoPrograma();
                    run = false;
                    break;
            }
        }

    }
}
