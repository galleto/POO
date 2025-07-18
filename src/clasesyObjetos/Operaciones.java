/*
 * Clase: Operacion.java
 * Arimetica Simple
 * 
 * @ autor: Gael Guerrero
 * @ version: 6.30.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */

package clasesyObjetos;
public class Operaciones {
    public double calcularTotal(double compra) {
        double descuento = 0;

        if (compra >= 100 && compra <= 200) {
            descuento = 10;
        } else if (compra > 200) {
            descuento = 20;
        }

        return compra - descuento;
    }
}