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

public class Persona {
	// Atributos
	String name;
	int age;
	
	// Metodos
	
	
	// Constructor
	public Persona(String _name, int _age) {
		name = _name;
		age = _age;
	}
	public void mostarDatos() {
		System.out.println("El nombre es: " + name);
		System.out.println("Tu edad es: "   + age);
	}
}
