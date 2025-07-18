/*
 * Clase: Main2.java
 * Programa principal de Operaciones22.java
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.1.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

import javax.swing.JOptionPane;

public class Main22 {

	public static void main(String[] args) {
     double n1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer entero"));
     double n2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el segundo número entero"));
	   
     Operacion22 op2 = new Operacion22();
     
     //int    suma   = op2.sumar(n1, n2);
    
     //double divi = op2.dividir(n1, n2);
     op2.mostrar();


	}

}
