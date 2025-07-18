/*
 *  Sub Clase: Veiculo_Turismo.java
 *  Sub Clase de un veiculo para el turismo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.16.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package poli;
public class Veiculo_Turismo extends Veiculo{
  // atributos
   private int numPuertas;
   
   // constructor 
   public Veiculo_Turismo(String matricula, String marca, String modelo, int numPuertas) {
	   super(matricula, marca, modelo);
	   this.numPuertas = numPuertas;
   }
   
// Getters y Setters
   public int getnumPuertas() {
       return numPuertas;
   }

   public void setnumPuertas(int numPuertas) {
       this.numPuertas = numPuertas;
   }
   
// Método para mostrar datos
   @Override
   public void mostrarDatos() {
       System.out.println(">>> Veiculo_Turismo <<<");
       super.mostrarDatos();
       System.out.println("Numero de puertas: " + numPuertas);
       
   }
}
