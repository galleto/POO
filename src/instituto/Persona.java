/*
 * Clase: Persona.java
 *  Ejemplo de sobreescritura para la clase de una persona
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package instituto;
public class Persona {
	    // Atributos
	    private String nombre;
	    private int edad;

	    // Constructor
	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    // Getters y Setters
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }


	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	    public void vivo() {
			System.out.println("SOY UN SER VIVO");
		}
        
	    // Método para mostrar datos básicos
	    public void mostrarDatosBasicos() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	    }
	}
