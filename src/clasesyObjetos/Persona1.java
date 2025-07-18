/*
 * Clase: AreaYPerimetro.java
 * Programa principal para obtener los datos de un rectangulo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.2.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */

package clasesyObjetos;

public class Persona1 {
	// Atributos
	String name, curp;
	int age;
	
	
	// Metodos
	public void run() {
		System.out.println("Soy " + name + ", mi edad es " + age +  " y estoy corriendo");
	}
	
	public void run(int km) {
		System.out.println("He recorrido " + km + " kilometros");
	}
	
	// Constructor 1
	public Persona1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Constructor 2
	public Persona1(String curp) {
		super();
		this.curp = curp;
	}
	
	
	
	
	
}
