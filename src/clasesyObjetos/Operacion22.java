/*
 * Clase: Operacion22.java
 * Arimetica Simple v22
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.1.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

public class Operacion22 {
	
	
	// metodos
	public int sumar(double n1, double n2) {
            return (int) (n1 + n2);
     }
	
	public double restar(double n1, double n2) {
        return (n1 - n2);
 }
	
	public double multi(int n1, int n2) {
        return (n1 * n2);
 }
	public double dividir(double n1, double n2) {
        return (n1 / n2);
 }
	
   
   
    public void mostrar() {
      System.out.println("[----Resultados----]");
      System.out.println("La suma  es:  ");
      System.out.println("La resta es:  ");
      System.out.println("La multi es:  ");
      System.out.println("La divi  es:  ");
   }
}
	
	