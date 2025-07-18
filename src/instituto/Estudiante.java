/*
 * Clase: Estudiante.java
 *  Ejemplo de sobreescritura para la clase de una Estudiante
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package instituto;

public class Estudiante extends Persona {
	private String carrera;
    private long legajo;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera, long legajo) {
        super(nombre, edad);
        this.carrera = carrera;
        this.legajo = legajo;
    }
    
    // Getters y Setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public long getLegajo() {
        return legajo;
    }

    public void setLelajo(long legajo) {
        this.legajo = legajo;
    }
    // Sobreescritura
    @Override
    public void vivo() {
		System.out.println("Soy un estudiante");
	}
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== Estudiante ===");
        mostrarDatosBasicos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Legajo: " + legajo);
        vivo();
        
    }
	
}
