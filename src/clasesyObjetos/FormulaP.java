
/*
 * Clase: FormulaP.java
 * Programa principal para hacer los calculos
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.2.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;

public class FormulaP {
	private double a;
	private double b;
	private double c;
	private double discriminante;
	 // Constructor cuando se inicializa normalmente es null, cada atributo tiene un peso y tamanio
    public FormulaP(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Calcular área
    public double calcular() {
        this.discriminante = b * b - 4 * a * c;
        return discriminante;
    }
	
    public void mostarFor() {
    	 if (discriminante > 0) {
             double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
             double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
             System.out.println("Las raíces son reales y diferentes:");
             System.out.println("Raíz 1: " + raiz1);
             System.out.println("Raíz 2: " + raiz2);
         } else if (discriminante == 0) {
             double raiz = -b / (2 * a);
             System.out.println("Las raíces son reales e iguales:");
             System.out.println("Raíz: " + raiz);
         } else {
             System.out.println("Las raíces son complejas y diferentes:");
             double parteReal = -b / (2 * a);
             double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
             System.out.println("Raíz 1: " + parteReal + " + " + parteImaginaria + "i");
             System.out.println("Raíz 2: " + parteReal + " - " + parteImaginaria + "i");
         }

    }
    
	
	
	
	
}
