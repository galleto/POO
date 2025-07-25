/*
 * Clase: Masajista2.java
 * clase para obtener la informacion de la masajista
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */
package futbol_2;

public class Masajista2 extends SeleccionFutbol2 {
	// Atributos
    private int exper;
    private String titulo;

    // Constructor
    public Masajista2(String nombre, String apellido, int edad, int id, int exper, String titulo) {
        super(apellido, nombre, id, edad);
        this.exper = exper;
        this.titulo = titulo;
    }

    // Método 
    @Override
    public void concertracer() {
        System.out.println("La Masajista se esta concentrando");
    }
    @Override
    public void viajar() {
        System.out.println("La Masajista va viajar con el equipo ");

    }

    public void darMasaje() {
        System.out.println("La Masajista comienza a dar masajes ");

    }
    
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== Masajista ===");
        mostrarDatosBasicos();
        System.out.println("Experiencia: " + exper);
        System.out.println("Titulo: " + titulo);
        concertracer();
        viajar();
        darMasaje();
        
    }

    // Getters y Setters
    public int getExperiencia() {
        return exper;
    }

    public void setIExperiencia(int exper) {
        this.exper = exper;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
}
