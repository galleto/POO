package futbol_2;

public class SeleccionFutbol2 {
	    private int id;
	    private String nombre;
	    private String apellido;
	    private int edad;

	    // Constructor
	    public SeleccionFutbol2(String nombre, String apellido, int edad, int id) {
            this.id = id;	       
	    	this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
	    }

	    // Getters y Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public void concertracer() {
	        System.out.println("ESTOY CONCENTRANDOME");
	    }
	    
	    public void viajar() {
	        System.out.println("ESTOY VIAJANDO");

	    }

	    // Método para mostrar datos básicos
	    public void mostrarDatosBasicos() {
	    	System.out.println("ID: " + id);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellido: " + apellido);
	        System.out.println("Edad: " + edad);
	    }
	}

