/*
 * Clase: Promedio.java
 * Programa Principal
 * @ autor: Gael Guerrero
 * @ version: 7.4.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 * 
*/ 
package clasesyObjetos;

import javax.swing.JOptionPane;

public class E2_06_Calificacion_Final {
    public static void main(String[] args) {
        Promedio promedio = new Promedio();

        double practica = pedirNota("Ingrese la nota práctica (30%):");
        double teorica = pedirNota("Ingrese la nota teórica (60%):");
        double participacion = pedirNota("Ingrese la nota de participación (10%):");

        promedio.setNotas(practica, teorica, participacion);

        double resultado = promedio.calcularPromedioPonderado();
        boolean aprueba = promedio.aprueba();

        String mensaje = "Calificación final: " + String.format("%.2f", resultado) + "\n";
        mensaje += aprueba ? "APROBADO :D" : "REPROBADO D:";

        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Función auxiliar para pedir nota con validación
    public static double pedirNota(String mensaje) {
        double nota = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) System.exit(0); // Cancelar
                nota = Double.parseDouble(input);
                if (nota < 0 || nota > 100) throw new NumberFormatException();
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una nota válida entre 0 y 100.");
            }
        }
        return nota;
    }
}