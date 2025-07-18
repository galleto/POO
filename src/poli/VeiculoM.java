/*
 *  Clase Main: VeiculoM.java
 *  Clase Main de todos nuestros veiculos
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.16.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package poli;

public class VeiculoM {

	public static void main(String[] args) {
		Veiculo allV[] = new Veiculo[4];
		
		// clase padre
		allV[0] = new Veiculo("KODOSD", "Ford", "RED");
		
		// clases hijas
		allV[1] = new Veiculo_Turismo("ISSDO", "Silverado", "Blus", 5);
		allV[2] = new Veiculo_Deportivo("ASIAa", "Ferrari", "Dark", 500);
		allV[3] = new Veiculo_Furgoneta("ASAS", "Mercedes", "Green", 1010);
		
	    // Mostrar información de cada veiculo
		for(Veiculo veiculos: allV) {
			System.out.println("\n" + "=".repeat(40) + "\n");
			veiculos.mostrarDatos();
		}
		
		
		
		//Veiculo_Turismo TT = new Veiculo_Turismo(
		         //"SD92C", "Silverado", "Blus", 4);
		     
		//Veiculo_Deportivo DD = new Veiculo_Deportivo(
		        // "SSC029", "Porche", "Redwine", 7);
	     
		//Veiculo_Furgoneta FF = new Veiculo_Furgoneta(
			     //"8qs98c", "Ford", "white", 1010);
		     
		     // Mostrar información de cada veiculo
		     //System.out.println("\n" + "=".repeat(40) + "\n"); 
		     //TT.mostrarDatos();
		     //System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     //DD.mostrarDatos();
		     //System.out.println("\n" + "=".repeat(40) + "\n");
		     
		     //FF.mostrarDatos();
		     //System.out.println("\n" + "=".repeat(40) + "\n");


	}

}
