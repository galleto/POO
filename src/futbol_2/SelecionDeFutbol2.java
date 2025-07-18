/*
 * Clase: SelecionDeFutbol2.java
 * clase principal para dar a conocer al equipo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */
package futbol_2;
public class SelecionDeFutbol2 {

	public static void main(String[] args) {
		     Futbolista2 futb2 = new Futbolista2(
		         "Guerrero", "Gael", 93, 21, 69, "Defensa");
		     
		     Entrenador2 entren2 = new Entrenador2(
		         "Lopez", "Carlos", 23, 28, 2);
		     
		     Masajista2 masahi2 = new Masajista2(
		         "López", "María", 35, 55, 9, "Masajista Junior");
		     
		     // Mostrar información de cada empleado
		     futb2.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     entren2.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     masahi2.mostrarDatos();
		     System.out.println("\n" + "=".repeat(40) + "\n");
	}

}
