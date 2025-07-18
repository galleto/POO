/*
 * Clase: Profesor.java
 *  Ejemplo de sobreescritura para la clase de una Profesor
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */

package instituto;
public class Profesor extends Persona{
	private String materia;
    private String cargo;

    // Constructor
    public Profesor(String nombre, int edad, String materia, String cargo) {
        super(nombre, edad);
        this.materia = materia;
        this.cargo = cargo;
    }
    
    // Getters y Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void vivo() {
		System.out.println("Soy un profesor");
	}
    
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== Profesor ===");
        mostrarDatosBasicos();
        System.out.println("Materia: " + materia);
        System.out.println("Cargo: " + cargo);
        vivo();
        
    }
}
