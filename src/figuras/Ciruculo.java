package figuras;

public class Ciruculo {
    private double radio;

    public Ciruculo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public void mostrarDatos() {
        System.out.println("=== Círculo ===");
        System.out.println("Área: " + calcularArea());
        System.out.println("Circunferencia: " + calcularCircunferencia());
    }
}
