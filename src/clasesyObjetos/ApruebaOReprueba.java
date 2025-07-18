/*
 * Clase: ApruebaOreproeba.java
 * Programa principal para dar un promedio
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.2.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;
import javax.swing.JOptionPane;

public class ApruebaOReprueba {
    public static void main(String[] args) {
        // Crear objeto para calcular promedio
        Promedio promedio = new Promedio();
        
        // Solicitar las 5 calificaciones
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Ingrese la calificación " + (i + 1) + ":");
            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado.");
                return;
            }
            
            try {
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                i--; // Repetir
            }
        }
        
        // Obtener resultado
        
        boolean aprueba = promedio.aprueba();
        
        // Mostrar resultado
        String mensaje = "Promedio: " + String.format("%.2f") + "\n";
        if (aprueba) {
            mensaje += "APROBADO :D";
        } else {
            mensaje += "REPROBADO D:";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}