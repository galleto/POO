/* 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */   
package figuras;


public class Triangulo {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    public void mostrarDatos() {
        System.out.println("=== Triángulo ===");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLado1() { return lado1; }
    public void setLado1(double lado1) { this.lado1 = lado1; }

    public double getLado2() { return lado2; }
    public void setLado2(double lado2) { this.lado2 = lado2; }
}