/*
 * Clase: Formula General.java
 * Programa principal para hacer obtener los datos de nuestra ecuacion cuadratica
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

public class Formula_General1 {

	public static void main(String[] args) {
		// solicitar datos al usuario
		String inputa = JOptionPane.showInputDialog("Ingrese el valor de a:");
		String inputb = JOptionPane.showInputDialog("Ingrese el valor de b:");
		String inputc = JOptionPane.showInputDialog("Ingrese el valor de c:");
		
		 double a = Double.parseDouble(inputa);
         double b = Double.parseDouble(inputb);
         double c = Double.parseDouble(inputc);
         
         
         // Crear objeto rectángulo
         FormulaP formulap = new FormulaP(a, b, c);
         
         // Calcular mostrar
         formulap.calcular();
         formulap.mostarFor();

	
	}

}
