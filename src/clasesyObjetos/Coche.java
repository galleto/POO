package clasesyObjetos;
/*
 * Clase: Coche.java
 * Una clase llamada coche
 * 
 * @ autor: Gael Guerrero
 * @ version: 6.30.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
public class Coche {
	// Atributos
	String color;
	String marca;
	int km;

	// metodos = acciones
	public static void main(String[] args) { // inicio de main
		Coche coche1 = new Coche();
		
		// se asignan valores a los atributos
		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;
			
		// Mensaje 
		System.out.println("El color del coche es: " + coche1.color);
		System.out.println("La marca del coche es: " + coche1.marca);
		System.out.println("El Kilometraje es : "    + coche1.km);
		
		
		// Obejto 2 - inicio
		Coche coche2 = new Coche();
		
		// Desarrollo
		coche2.color = "Rojo";
		coche2.marca = "Ferrari";
		coche2.km = 100;

        // Salida
		System.out.println("--------------------------");
		System.out.println("El color del segundo coche es: " + coche2.color);
		System.out.println("La marca del segundo   coche es: " + coche2.marca);
		System.out.println("El Kilometraje es : "    + coche2.km);
		
	} // fin de main

} // fin de clase