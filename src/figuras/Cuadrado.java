package figuras;

public class Cuadrado {
// Atributos
	private double l;
// Construtor
	public Cuadrado(double l) {
		this.l = l;
	}
// Metodos
	public double calcularArea() {
		return (l * l);
	}
	
	public double calcularPerimetro() {
		return (4 * l);
	}
	
// Get y Set
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	 public void mostrarDatos() {
	        System.out.println("=== Cuadrado ===");
	        System.out.println("Mi Area           es: " + calcularArea());
	        System.out.println("Mi Perimetro      es: " + calcularPerimetro());
	    }
}
