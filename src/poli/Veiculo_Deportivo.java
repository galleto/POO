/*
 *  Sub Clase: Veiculo_Deportivo.java
 *  Sub Clase de un veiculo deportivo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.16.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package poli;

public class Veiculo_Deportivo extends Veiculo{
 // Atributos
  private int cilidnro;
 // Constructor
	public Veiculo_Deportivo(String matricula, String marca, String modelo, int cilidnro) {
		super(matricula, marca, modelo);
		this.cilidnro = cilidnro;
	}
	
 	// Getters y Setters
	   public int getCilidrno() {
	       return cilidnro;
	   }

	   public void setCilidro(int cilidnro) {
	       this.cilidnro = cilidnro;
	   }
	   
	// Método para mostrar datos
	   @Override
	   public void mostrarDatos() {
	       System.out.println(">>> Veiculo Deportivo <<<");
	       super.mostrarDatos();
	       System.out.println("Cilidro: " + cilidnro);
	       
	   }
	
}
