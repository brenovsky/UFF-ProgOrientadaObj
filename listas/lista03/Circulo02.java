package listas.lista03;

public class Circulo02 {
    private int x;
    private int y;
    private float r;

    Circulo02(int x, int y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void Desenhar() {
        System.out.printf("Você desenhou o retângulo %.2f em (%d,%d)%n", this.r, this.x, this.y);
    }

    public void Mover(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.printf("Agora o seu retângulo está em (%d,%d)%n", this.x, this.y);
    }

    public void Redimensionar(float r) {
        this.r = r;

        System.out.printf("Agora o raio do circulo mede %.2f%n", this.r);
    }

    public void CalcularPerimetro() {
        double perimetro = Math.PI * 2 * this.r;
        System.out.printf("Perimetro = %.2f%n", perimetro);
    }

    public void CalcularArea() {
        double area = Math.PI * this.r * this.r;
        System.out.printf("Area = %.2f%n", area);
    }
}
