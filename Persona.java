package POO_Ejercicios3;

public class Persona {
	
	//Creamos los atributos de la clase Persona
	
	protected String nombre, apellido, apellido2, dni, domicilio, telefono;
	
	
	//Creamos los constructores sin y con parametros
	
	
	public Persona () {}

	public Persona(String nombre, String apellido, String apellido2, String dni, String domicilio, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	//Y por ultimo los setters y getters de cada atributos de nuestra clase Persona
	
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

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void saludar() {
		System.out.println("Hola, mi nombre es "+nombre+" "+apellido+" "+apellido2+".");
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellidos = "+apellido+" "+apellido2);
		System.out.println("Domicilio = "+domicilio);

	}
	
	
}
