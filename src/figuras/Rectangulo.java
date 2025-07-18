/* 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */   
package figuras;

public class Rectangulo {
	// Atributos
		private double b, h;
	// Construtor
		public Rectangulo(double b, double h) {
			this.b = b;
			this.h = h;
		}
	// Metodos
		public double calcularArea() {
			return (b * h);
		}
		
		public double calcularPerimetro() {
			return 2 * (b + h);
		}
		
	// Get y Set
		public double getB() {
			return b;
		}
		public void setB(double b) {
			this.b = b;
		}
		
		public double getH() {
			return h;
		}
		public void setH(double h) {
			this.h = h;
		}
		
		// Método para mostrar datos
	    public void mostrarDatos() {
	        System.out.println("=== Rectangulo ===");
	        System.out.println("Mi Area           es: " + calcularArea());
	        System.out.println("Mi Perimetro      es: " + calcularPerimetro());
	        
	    }
	}