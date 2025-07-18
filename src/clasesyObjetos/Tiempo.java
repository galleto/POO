/*
 * Clase: Tiempo.java
 * Clase para calcular el tiempo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.3.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;
public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos; 
    
    // Constructor con 3 parámetros
    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    // Constructor que recibe solo segundos totales
    public Tiempo(int segundosTotales) {
        this.horas = segundosTotales / 3600;
        int resto = segundosTotales % 3600;
        this.minutos = resto / 60;
        this.segundos = resto % 60;
    }
    
    // Método para convertir tiempo a segundos totales
    public int aSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }
    
    // Método toString para mostrar el tiempo
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
