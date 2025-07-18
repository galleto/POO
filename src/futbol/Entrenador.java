/*
 * Clase: Entrenador.java
 * clase para obtener la informacion del entrenador
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */
package futbol;

public class Entrenador extends SeleccionFutbol {
	// Atributos
    private int idFederacion;

    // Constructor
    public Entrenador(String nombre, String apellido, int edad, int id, int idFederacion) {
        super(apellido, nombre, id, edad);
        this.idFederacion = idFederacion;
    }

    // Método para calcular sueldo
    public void concertracer() {
        System.out.println("El Entrenador esta concentrandoce ");
    }
    
    public void viajar() {
        System.out.println("El Entrenador va viajar");

    }

    public void dirigirPartido() {
        System.out.println("El Entrenador va a dirigir el partido");

    }
    
    public void dirigirEntrenamiento() {
        System.out.println("El Entrenador va a dirigir el entrenamiento");

    }
    
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== Entrenador ===");
        mostrarDatosBasicos();
        System.out.println("idFederacion: " + idFederacion);
        concertracer();
        viajar();
        dirigirPartido();
        dirigirEntrenamiento();
        
    }

    // Getters y Setters
    public int getIDFederacion() {
        return idFederacion;
    }

    public void setIDFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
  
}
