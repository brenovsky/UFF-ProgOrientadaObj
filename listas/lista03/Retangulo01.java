package listas.lista03;

public class Retangulo01 {
    private int x;
    private int y;
    private int largura;
    private int altura;

    Retangulo01(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public void Desenhar() {
        System.out.printf("Você desenhou o retângulo %dx%d em (%d,%d)%n", this.largura, this.altura, this.x, this.y);
    }

    public void Mover(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.printf("Agora o seu retângulo está em (%d,%d)%n", this.x, this.y);
    }

    public void Redimensionar(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;

        System.out.printf("Agora o seu retângulo mede %dx%d%n", this.largura, this.altura);
    }

    public void CalcularArea() {}
}
