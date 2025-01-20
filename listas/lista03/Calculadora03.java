package listas.lista03;

public class Calculadora03 {
    private static int memoria = 0;

    public static void MostrarMemoria() {
        System.out.printf("Estado da memória: %d%n", memoria);
    }

    public static void MostrarMenu() {
        System.out.println("\nOpcoes:");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa\n");
    }

    public static void Somar(int n) {
        memoria += n;
    }

    public static void Subtrair(int n) {
        memoria -= n;
    }

    public static void Multiplicar(int n) {
        memoria *= n;
    }

    public static void Dividir(int n) {
        memoria /= n;
    }

    public static void LimparMemoria() {
        memoria = 0;
        System.out.println("\nMemoria limpa!\n");
    }

    public static void SairDoPrograma() {
        System.out.println("Encerrando...");
    }
}
