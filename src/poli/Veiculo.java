/*
 *  Clase Padre: Veiculo.java
 *  Clase padre de nuestro veiculo
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.16.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package poli;
public class Veiculo {
	// Atributos
	private String matricula;
	private String marca;
	private String modelo;
	
	// Constructor
	public Veiculo(String matricula, String marca, String modelo) {
	this.matricula = matricula;
	this.marca = marca;
	this.modelo = modelo;
	}
   
	// Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
  /////////////////////////////////
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
	
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // Metodos
    public void mostrarDatos() {
    	System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
	
	
	
	
	
	
}
