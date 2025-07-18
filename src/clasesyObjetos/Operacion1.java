/*
 * Clase: Operacion1.java
 * Arimetica Simple v1
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.1.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

public class Operacion1 {
	double s, r, m;
	double d;
	
	// metodos
	
	  public void sumar(double n1, double n2) {
            s = (n1 + n2);
     }
	
   public void restar(double n1, double n2) {
       r = (n1 - n2);

     }
   public void multi(double n1, double n2) {
       m = (n1 * n2);
     }
   public void dividir(double n1, double n2) {
       d = (n1 / n2);
     }

   
   public void mostrar() {
      System.out.println("[----Resultados----]");
      System.out.println("La suma  es:  " + s);
      System.out.println("La resta es:  " + r);
      System.out.println("La multi es:  " + m);
      System.out.println("La divi  es:  " + d);
   }












}
