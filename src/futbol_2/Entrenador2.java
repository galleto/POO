/*
 * Clase: Entrenador2.java
 * clase para obtener la informacion del entrenador
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */
package futbol_2;

public class Entrenador2 extends SeleccionFutbol2 {
	// Atributos
    private int idFederacion;

    // Constructor
    public Entrenador2(String nombre, String apellido, int edad, int id, int idFederacion) {
        super(apellido, nombre, id, edad);
        this.idFederacion = idFederacion;
    }

    // Método 
    @Override
    public void concertracer() {
        System.out.println("El Entrenador esta concentrandoce ");
    }
    @Override
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
