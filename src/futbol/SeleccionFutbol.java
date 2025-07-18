package futbol;

public class SeleccionFutbol {
	    private int id;
	    private String nombre;
	    private String apellido;
	    private int edad;

	    // Constructor
	    public SeleccionFutbol(String nombre, String apellido, int edad, int id) {
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

	    // Método para mostrar datos básicos
	    public void mostrarDatosBasicos() {
	    	System.out.println("ID: " + id);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellido: " + apellido);
	        System.out.println("Edad: " + edad);
	    }
	}

