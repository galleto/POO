/*
 * Clase: Descuento.java
 * Un descuento en la compra total de un producto
 * 
 * @ autor: Gael Guerrero
 * @ version: 6.30.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */

package clasesyObjetos;
import javax.swing.JOptionPane;

public class Descuento { // inicio de nuestra clase
	
    public static void main(String[] args) { // inicio de nuestro programa principal
    	
        String entrada = JOptionPane.showInputDialog("Ingrese el total de la compra:");
        /*
         * en nuestra entrada hacemos un mensaje al usuario para que 
         * ingrese un valor (Aqui validamos la entrada)
         * 
         * en passeDouble convertimos los valores que tiene entrada a un tipo double 
         * para que acepte decimales como enteros
         */
        double totalCompra = Double.parseDouble(entrada);

        if (totalCompra < 0) {
            JOptionPane.showMessageDialog(null, "El total no puede ser negativo."); // validamos para que no acepte numeros negativos
        } else {
            Operaciones op = new Operaciones();
            double totalFinal = op.calcularTotal(totalCompra);

            JOptionPane.showMessageDialog(null, "Total a pagar: $" + totalFinal);
        } 
    }
} // fin de la clase y de casi todo :]
