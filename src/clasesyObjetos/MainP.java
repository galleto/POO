/*
 * Clase: MainP.java
 * Clase principal de Persona.java
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.3.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

public class MainP {

	public static void main(String[] args) {
		// creamos objet
		Persona p1 = new Persona("Gael", 21);
		PersonaThis p2 = new PersonaThis("Adrian", 21);

		// Mostrar los datos
		p1.mostarDatos();
		System.out.println("-----------------");
		p2.mostarDatos();
		
	}

}
