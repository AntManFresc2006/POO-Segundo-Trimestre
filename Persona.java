package POO_Ejercicio1;

public class Persona {

	// Declaramos los atributos privados de nuestra clase persona como privados

	private String nombre, apellido, dni, domicilio;
	private int telefono;

//Metemos un constructor vacio y luego otro constructor lleno.

	public Persona() {
	}

	public Persona(String nombre, String apellido, String dni, String domicilio, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

//Ahora creamos los metodos setters y getters

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
