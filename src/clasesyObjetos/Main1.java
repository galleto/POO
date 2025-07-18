/*
 * Clase: Main1.java
 * Clase principal de operacion1.java
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

public class Main1 {

	public static void main(String[] args) {
     double n1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer entero"));
     double n2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el segundo número entero"));
	   
     Operacion1 op1 = new Operacion1();
     
     op1.sumar(n1, n2);
     op1.restar(n1, n2);
     op1.multi(n1, n2);
     op1.dividir(n1, n2);
     op1.mostrar();


	}

}
