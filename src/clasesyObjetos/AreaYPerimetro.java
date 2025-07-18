/*
 * Clase: AreaYPerimetro.java
 * Programa principal para obtener los datos de un rectangulo
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
public class AreaYPerimetro {
    public static void main(String[] args) {
        try {
            // Solicitar datos del rectángulo
            String inputLargo = JOptionPane.showInputDialog("Ingrese el largo del rectángulo:");
            if (inputLargo == null) return;
            
            String inputAncho = JOptionPane.showInputDialog("Ingrese el ancho del rectángulo:");
            if (inputAncho == null) return;
            
            // Convertir a números
            double largo = Double.parseDouble(inputLargo);
            double ancho = Double.parseDouble(inputAncho);
            
            // Crear objeto rectángulo
            Rectangulo rectangulo = new Rectangulo(largo, ancho);
            
            // Calcular área y perímetro
            double area = rectangulo.calcularArea();
            double perimetro = rectangulo.calcularPerimetro();
            
            // Mostrar resultados
            String mensaje = "RECTÁNGULO\n" +
                           "Largo: " + largo + "\n" +
                           "Ancho: " + ancho + "\n\n" +
                           "Área: " + area + "\n" +
                           "Perímetro: " + perimetro;
            
            JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}