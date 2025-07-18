/*
 *  Sub Clase: Veiculo_Furgoneta.java
 *  Sub Clase de una Furgoneta
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.16.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package poli;

public class Veiculo_Furgoneta extends Veiculo {
// Atibutos
	private int carga;
// Constuctor
	public Veiculo_Furgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}
	
	// Getters y Setters
	   public int getCarga() {
	       return carga;
	   }

	   public void setCarga(int carga) {
	       this.carga = carga;
	   }
	   
	// Método para mostrar datos
	   @Override
	   public void mostrarDatos() {
	       System.out.println(">>> Veiculo Furgoneta <<<");
	       super.mostrarDatos();
	       System.out.println("Carga: " + carga);
	       
	   }
}
