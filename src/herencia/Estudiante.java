/*
 * Clase: Estudiante.java
 * 
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.9.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package herencia;

public class Estudiante extends Persona {
	// Atributos
	  private int codigoE;
	  private float notaF;
	  
	   // Metodos
	   
	   // Metodo Constuctor
	   public Estudiante(String nombre, String apellido, int edad, int codigoE, float notaF) {
		   super(nombre, apellido, edad);
		   this.codigoE = codigoE;
		   this.notaF = notaF;
	   }
	   
	   // Getters
	  public void mostrarDatos() {
		  System.out.println
		  ("Tu nombre es:  " + getNombre() + "\n" +
		   "Apellido: " + getApellido()  + "\n" +
		   "Edad: " + getEdad() + "\n" +
		   "Tu codigo es: " + codigoE + "\n" +
		   "Tu nota final es: " + notaF);
	  }

}
