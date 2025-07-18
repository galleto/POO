/*
 * Clase: MaestroPorHora.java
 * Clase para obtener la informacion del Maestro por hota
 * @ autor: Gael Guerrero
 * @ version: 7.9.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package herencia;

public class MaestroPorHora extends Persona {
    // Constantes
    private double SUELDO_POR_HORA = 150.0;
    
    // Atributos
    private int horasClase;
    private int horasFaltas;

    // Constructor
    public MaestroPorHora(String nombre, String apellido, int edad, int horasClase, int horasFaltas) {
        super(nombre, apellido, edad);
        this.horasClase = horasClase;
        this.horasFaltas = horasFaltas;
    }

    // Método para calcular sueldo
    public double calcularSueldo() {
        return (horasClase - horasFaltas) * SUELDO_POR_HORA;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== MAESTRO POR HORA ===");
        mostrarDatosBasicos();
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Horas de faltas: " + horasFaltas);
        System.out.println("Sueldo por hora: $" + SUELDO_POR_HORA);
        System.out.println("Sueldo total: $" + calcularSueldo());
    }

    // Getters y Setters
    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasFaltas() {
        return horasFaltas;
    }

    public void setHorasFaltas(int horasFaltas) {
        this.horasFaltas = horasFaltas;
    }
}
