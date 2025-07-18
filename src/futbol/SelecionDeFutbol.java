/*
 * Clase: SelecionDeFutbol.java
 * clase principal para dar a conocer al equipo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */
package futbol;
public class SelecionDeFutbol {

	public static void main(String[] args) {
		     Futbolista futb = new Futbolista(
		         "Guerrero", "Gael", 93, 21, 69, "Defensa");
		     
		     Entrenador entren = new Entrenador(
		         "Lopez", "Carlos", 23, 28, 2);
		     
		     Masajista masahi = new Masajista(
		         "López", "María", 35, 55, 9, "Masajista Junior");
		     
		     // Mostrar información de cada empleado
		     futb.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     entren.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     masahi.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
	}

}
