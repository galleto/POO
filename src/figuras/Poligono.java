package figuras;
public class Poligono {
    private double lado;
    private int numLados;
    private double apotema;

    public Poligono(double lado, int numLados, double apotema) {
        this.lado = lado;
        this.numLados = numLados;
        this.apotema = apotema;
    }

    public double calcularPerimetro() {
        return lado * numLados;
    }

    public double calcularArea() {
        return (calcularPerimetro() * apotema) / 2;
    }

    public void mostrarDatos() {
        System.out.println("=== Polígono regular ===");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}