/*
 * Clase: E3_04_Escuela.java
 *  Clase pricnipal de la super clase persona
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package instituto;
public class E3_04_Escuela {

	public static void main(String[] args) {
 
		Estudiante entudi = new Estudiante(
		         "Gael", 21, "Sistemas", 12912);
		     
		Profesor profs = new Profesor(
		         "Guerrero", 89, "Base de datos", "El mejor de todos");
		     
		     // Mostrar información de cada empleado
		     entudi.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     profs.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
		     
	}

}
