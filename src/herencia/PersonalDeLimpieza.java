/*
 * Clase: PersonalDeLimpieza.java
 * Clase para obtener la informacion de la Persona De Limpieza
 * @ autor: Gael Guerrero
 * @ version: 7.9.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package herencia;

public class PersonalDeLimpieza extends Persona {
    // Constantes
    private double SUELDO_DIARIO = 172.87;
    
    // Atributos
    private int diasTrabajados;
    private int faltas;

    // Constructor
    public PersonalDeLimpieza(String nombre, String apellido, int edad, int diasTrabajados, int faltas) {
        super(nombre, apellido, edad);
        this.diasTrabajados = diasTrabajados;
        this.faltas = faltas;
    }

    // Método para calcular sueldo
    public double calcularSueldo() {
        return (diasTrabajados - faltas) * SUELDO_DIARIO;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("=== PERSONAL DE LIMPIEZA ===");
        mostrarDatosBasicos();
        System.out.println("Días trabajados: " + diasTrabajados);
        System.out.println("Faltas: " + faltas);
        System.out.println("Sueldo diario: $" + SUELDO_DIARIO);
        System.out.println("Sueldo total: $" + calcularSueldo());
    }

    // Getters y Setters
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
