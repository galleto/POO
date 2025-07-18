/*
 * Clase: Rectangulo.java
 * Programa para la clase de un rectangulo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.2.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;
public class Rectangulo {
    private double largo;
    private double ancho;
    
    // Constructor cuando se inicializa normalmente es null, cada atributo tiene un peso y tamanio
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    // Calcular área
    public double calcularArea() {
        return largo * ancho;
    }
    
    // Calcular perímetro
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
    
    // Getters
    public double getLargo() {
        return largo;
    }
    
    public double getAncho() {
        return ancho;
    }
}
