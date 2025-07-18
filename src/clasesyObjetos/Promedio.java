/*
 * Clase: Promedio.java
 * Programa para calcular el promedio de 3 notas
 * @ autor: Gael Guerrero
 * @ version: 7.4.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

public class Promedio {
    private double notaPractica;
    private double notaTeorica;
    private double notaParticipacion;

    public void setNotas(double practica, double teorica, double participacion) {
        this.notaPractica = practica;
        this.notaTeorica = teorica;
        this.notaParticipacion = participacion;
    }

    public double calcularPromedioPonderado() {
        return (notaPractica * 0.30) + (notaTeorica * 0.60) + (notaParticipacion * 0.10);
    }

    public boolean aprueba() {
        return calcularPromedioPonderado() >= 70.0;
    }
}