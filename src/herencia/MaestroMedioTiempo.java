/*
 * Clase: MaestroPorHora.java
 * Clase para obtener la informacion del Maestro de medio tiempo
 * @ autor: Gael Guerrero
 * @ version: 7.9.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package herencia;

public class MaestroMedioTiempo extends Persona {
    // Constantes
    private double SUELDO_POR_HORA = 170.0;
    private int HORAS_SEMANALES = 20;
    
    // Atributos
    private int horasFaltas;

    // Constructor
    public MaestroMedioTiempo(String nombre, String apellido, int edad, int horasFaltas) {
        super(nombre, apellido, edad);
        this.horasFaltas = horasFaltas;
    }

    // Método para calcular sueldo
    public double calcularSueldo() {
        return (HORAS_SEMANALES - horasFaltas) * SUELDO_POR_HORA;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== MAESTRO MEDIO TIEMPO ===");
        mostrarDatosBasicos();
        System.out.println("Horas semanales: " + HORAS_SEMANALES);
        System.out.println("Horas de faltas: " + horasFaltas);
        System.out.println("Sueldo por hora: $" + SUELDO_POR_HORA);
        System.out.println("Sueldo semanal: $" + calcularSueldo());
    }

    // Getters y Setters
    public int getHorasFaltas() {
        return horasFaltas;
    }

    public void setHorasFaltas(int horasFaltas) {
        this.horasFaltas = horasFaltas;
    }
}