/* 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */   
package figuras;

public class Romboide {
    private double base;
    private double altura;
    private double ladoOblicuo;

    public Romboide(double base, double altura, double ladoOblicuo) {
        this.base = base;
        this.altura = altura;
        this.ladoOblicuo = ladoOblicuo;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + ladoOblicuo);
    }

    public void mostrarDatos() {
        System.out.println("=== Romboide ===");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLadoOblicuo() { return ladoOblicuo; }
    public void setLadoOblicuo(double ladoOblicuo) { this.ladoOblicuo = ladoOblicuo; }
}
