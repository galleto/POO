/*
 * Clase: Futbolista.java
 * clase para obtener la informacion dle jugador
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package futbol;

public class Futbolista extends SeleccionFutbol {
    // Atributos
    private int dorsal;
    private String demarcacion;

    // Constructor
    public Futbolista(String nombre, String apellido, int edad, int id, int dorsal, String demarcacion ) {
        super(apellido, nombre, id, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Método para calcular sueldo
    public void concertracer() {
        System.out.println("El futbolista esta concentrandoce ");

    }
    
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
