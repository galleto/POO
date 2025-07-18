/*
 * Clase: Futbolista.java
 * clase para obtener la informacion dle jugador
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.11.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package futbol_2;

public class Futbolista2 extends SeleccionFutbol2 {
    // Atributos
    private int dorsal;
    private String demarcacion;

    // Constructor
    public Futbolista2(String nombre, String apellido, int edad, int id, int dorsal, String demarcacion ) {
        super(apellido, nombre, id, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Método 
    @Override
    public void concertracer() {
        System.out.println("El futbolista esta concentrandoce ");

    }
    @Override
    public void viajar() {
        System.out.println("El futbolista va viajar");

    }

    public void jugarPartido() {
        System.out.println("El futbolista va jugar un partido");

    }
    
    public void entrenar() {
        System.out.println("El futbolista esta entrenado");

    }
    
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== Futbolista ===");
        mostrarDatosBasicos();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Demacaciom: " + demarcacion);
        concertracer();
        viajar();
        jugarPartido();
        entrenar();
        
    }

    // Getters y Setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
}
