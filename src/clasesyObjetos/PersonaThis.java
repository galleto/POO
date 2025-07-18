/*
 * Clase: Persona.java
 * Clase de Persona
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.3.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

public class PersonaThis {
	// Atributos
	String name;
	int age;
	
	// Metodos
	
	
	// Constructor
	public PersonaThis(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void mostarDatos() {
		System.out.println("El nombre es: " + name);
		System.out.println("Tu edad es: "   + age);
	}
}
