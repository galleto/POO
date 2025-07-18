/* 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */   
package figuras;

public class Rombo {
    // Atributos
    private double d1, d2;
    private double l;
    
    // constructor
    public Rombo(double d1, double d2, double l) {
   	 this.d1 = d1;
   	 this.d2 = d2;
	 this.l = l;
   }
    
    // Metodos
    public double calcularArea() {
		return (d1 * d2);
	}
	
	public double calcularPerimetro() {
		return 4 * (l);
	}
	// Get y Set
	public double getL() {
    	return l;
    }
    public void setL(double l) {
      	this.l = l;
    }
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}
	// Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== Rombo ===");
        System.out.println("Mi Area           es: " + calcularArea());
        System.out.println("Mi Perimetro      es: " + calcularPerimetro());
        
    }
	
}
